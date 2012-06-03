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
public class BookController implements Serializable {

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

		// chapter 1

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

		// chapter 3

		// chapter 4

		// chapter 5

		// chapter 6
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Dynamic and static positioned menus", "chapter6/positionedMenus.xhtml"),
		                    chapter6);

		// chapter 7

		// chapter 8

		// chapter 9

		// chapter 10

		// chapter 11

		// chapter 12
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
