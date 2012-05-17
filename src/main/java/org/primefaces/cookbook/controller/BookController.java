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

		TreeNode chapter1 = new DefaultTreeNode(new BookTreeNode("Chapter 1", null), root);
		TreeNode chapter2 = new DefaultTreeNode(new BookTreeNode("Chapter 2", null), root);
		TreeNode chapter3 = new DefaultTreeNode(new BookTreeNode("Chapter 3", null), root);
		TreeNode chapter4 = new DefaultTreeNode(new BookTreeNode("Chapter 4", null), root);
		TreeNode chapter5 = new DefaultTreeNode(new BookTreeNode("Chapter 5", null), root);
		TreeNode chapter6 = new DefaultTreeNode(new BookTreeNode("Chapter 6", null), root);
		TreeNode chapter7 = new DefaultTreeNode(new BookTreeNode("Chapter 7", null), root);
		TreeNode chapter8 = new DefaultTreeNode(new BookTreeNode("Chapter 8", null), root);
		TreeNode chapter9 = new DefaultTreeNode(new BookTreeNode("Chapter 9", null), root);
		TreeNode chapter10 = new DefaultTreeNode(new BookTreeNode("Chapter 10", null), root);
		TreeNode chapter11 = new DefaultTreeNode(new BookTreeNode("Chapter 11", null), root);
		TreeNode chapter12 = new DefaultTreeNode(new BookTreeNode("Chapter 12", null), root);

		// chapter 2
		new DefaultTreeNode(NODE_TYPE,
		                    new BookTreeNode("Standard theme switcher of PrimeFaces", "chapter2/stdThemeSwitcher.xhtml"),
		                    chapter2);
		new DefaultTreeNode(NODE_TYPE, new BookTreeNode("Alternative stateful theme switcher", "chapter2/altThemeSwitcher.xhtml"),
		                    chapter2);
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
