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

		constructChapter1(chapter1);
		constructChapter2(chapter2);
		constructChapter3(chapter3);
		constructChapter6(chapter6);
	}

	private void constructChapter1(TreeNode chapter1) {
		new DefaultTreeNode(NODE_TYPE,
		                    new BookTreeNode("Your first page with Primefaces Component", "chapter1/yourFirstPage.xhtml"),
		                    chapter1);
		new DefaultTreeNode(NODE_TYPE,
		                    new BookTreeNode("Internationalization of the Faces Messages", "chapter1/internationalization.xhtml"),
		                    chapter1);
        new DefaultTreeNode(NODE_TYPE,
                            new BookTreeNode("Basic Partial Page Rendering", "chapter1/basicPPR.xhtml"),
                            chapter1);
        new DefaultTreeNode(NODE_TYPE,
                            new BookTreeNode("Update Component in Different Naming Container", "chapter1/componentInDifferentNamingContainer.xhtml"),
                            chapter1);
        new DefaultTreeNode(NODE_TYPE,
                            new BookTreeNode("Partial Processing", "chapter1/partialProcessing.xhtml"),
                            chapter1);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Localization of Calendar Component", "chapter1/localization.xhtml"),
		                    chapter1);
		new DefaultTreeNode(NODE_TYPE,
		                    new BookTreeNode("Localization with Resources", "chapter1/localizationWithResources.xhtml"),
		                    chapter1);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Improved Resource Ordering", "chapter1/resourceOrdering.xhtml"),
		                    chapter1);
	}

	private void constructChapter2(TreeNode chapter2) {
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

    private void constructChapter3(TreeNode chapter3) {
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Formatted input with InputMask", "chapter3/inputMask.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Auto Suggestion with AutoComplete", "chapter3/autoComplete.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Advanced AutoComplete Scenarios", "chapter3/advancedAutoComplete.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Usable Features of InputTextArea", "chapter3/inputTextArea.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("SelectBooleanCheckbox and SelectManyCheckbox", "chapter3/selectBooleanCheckboxSelectManyCheckbox.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("SelectBooleanButton and SelectManyButton", "chapter3/selectBooleanButtonSelectManyButton.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Discovering Radio Selections", "chapter3/selectOneRadioRadioButton.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Basic and Advanced Calendar Scenarios", "chapter3/calendar.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Spinner - Different ways to provide input", "chapter3/spinner.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Slider - Different ways to provide input", "chapter3/slider.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Rich Text Editing with the Editor", "chapter3/editor.xhtml"),
                chapter3);
        new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Advanced Editing with in-place Editor", "chapter3/inPlaceEditor.xhtml"),
                chapter3);
    }

    private void constructChapter6(TreeNode chapter6) {
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Dynamic and static positioned menus", "chapter6/positionedMenus.xhtml"),
		                    chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Creating programmatic menu", "chapter6/programmaticMenu.xhtml"),
		                    chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Context menu with nested items", "chapter6/contextMenu.xhtml"),
		                    chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Context menu integration", "chapter6/contextMenuIntergration.xhtml"),
		                    chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Slide Menu - menu in iPod style", "chapter6/slideMenu.xhtml"), chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Tiered Menu - submenus in nested overlays", "chapter6/tieredMenu.xhtml"),
		                    chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Mega Menu - multi-column menu", "chapter6/megaMenu.xhtml"), chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("PanelMenu - hybrid of accordion and tree", "chapter6/panelMenu.xhtml"),
		                    chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Accessing commands via Menubar", "chapter6/menubar.xhtml"), chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Displaying checkboxes in overlay menu", "chapter6/checkboxMenu.xhtml"),
		                    chapter6);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Dock menu for Mac OS fans", "chapter6/dockMenu.xhtml"), chapter6);
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
		if (root == event.getTreeNode().getParent()) {
			return;
		}

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
