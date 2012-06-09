package org.primefaces.cookbook.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.cookbook.model.BookTreeNode;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 * BookController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@SessionScoped
public class BookController extends BaseController {

	private static final long serialVersionUID = 20121705L;

	private static final String NODE_TYPE = "chapteritem";

	private TreeNode root;

	private TreeNode selectedNode;

	public BookController() {
		root = new DefaultTreeNode("Root", null);

		TreeNode chapter1 = new DefaultTreeNode(new BookTreeNode("Getting Started with PrimeFaces", null), root);
		TreeNode chapter2 = new DefaultTreeNode(new BookTreeNode("Theming Concept", null), root);
		TreeNode chapter3 = new DefaultTreeNode(new BookTreeNode("Enhanced Inputs and Selects", null), root);
		TreeNode chapter4 = new DefaultTreeNode(new BookTreeNode("Grouping Content with Panels", null), root);
		TreeNode chapter5 = new DefaultTreeNode(new BookTreeNode("Data Iteration Components", null), root);
		TreeNode chapter6 = new DefaultTreeNode(new BookTreeNode("Endless Menu Variations", null), root);
		TreeNode chapter7 = new DefaultTreeNode(new BookTreeNode("Working with Files and Images", null), root);
		TreeNode chapter8 = new DefaultTreeNode(new BookTreeNode("Drag Me, Drop Me", null), root);
		TreeNode chapter9 = new DefaultTreeNode(new BookTreeNode("Creating Charts and Maps", null), root);
		TreeNode chapter10 = new DefaultTreeNode(new BookTreeNode("Miscellaneous, Advanced Use Cases", null), root);
		TreeNode chapter11 = new DefaultTreeNode(new BookTreeNode("Writing of Custom Components", null), root);
		TreeNode chapter12 = new DefaultTreeNode(new BookTreeNode("PrimeFaces Extensions in Action", null), root);

        constructChapter1(chapter1);
        constructChapter2(chapter2);
        constructChapter6(chapter6);
	}

    private void constructChapter1(TreeNode chapter1) {
        // chapter 1
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Your first page with Primefaces Component", "chapter1/yourFirstPage.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Internationalization of the Faces Messages", "chapter1/internationalization.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Localization of Calendar Component", "chapter1/localization.xhtml"),
                chapter1);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Localization with Resources", "chapter1/localizationWithResources.xhtml"),
                chapter1);
    }

    private void constructChapter2(TreeNode chapter2) {
        // chapter 2
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Customizing theme styles", "chapter2/customThemeStyles.xhtml"),
                            chapter2);
        new DefaultTreeNode(NODE_TYPE,
                            new BookTreeNode("Customizing default styles on input components",
                                             "chapter2/customInputStyles.xhtml"), chapter2);
        new DefaultTreeNode(NODE_TYPE,
                            new BookTreeNode("Default stateless theme switcher (Client-side)", "chapter2/stdThemeSwitcher.xhtml"),
                            chapter2);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Stateful theme switcher (AJAX)", "chapter2/altThemeSwitcher1.xhtml"),
                            chapter2);

        new DefaultTreeNode(NODE_TYPE,
                            new BookTreeNode("Stateful theme switcher (Full page refresh)", "chapter2/altThemeSwitcher2.xhtml"),
                            chapter2);
    }


    private void constructChapter6(TreeNode chapter6) {
        // chapter 6
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Dynamic and static positioned menus", "chapter6/positionedMenus.xhtml"),
                chapter6);
    }

    public TreeNode getRoot() {
		return root;
	}

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

	public void onNodeSelect(NodeSelectEvent event) {
		for (TreeNode treeNode : root.getChildren()) {
			if (treeNode.equals(selectedNode.getParent())) {
				treeNode.setExpanded(true);
			} else {
				treeNode.setExpanded(false);
			}
		}

		FacesContext fc = FacesContext.getCurrentInstance();
		fc.getApplication().getNavigationHandler()
		  .handleNavigation(fc, "null",
  		                  "/views/" + ((BookTreeNode) event.getTreeNode().getData()).getView() + "?faces-redirect=true");
	}
}
