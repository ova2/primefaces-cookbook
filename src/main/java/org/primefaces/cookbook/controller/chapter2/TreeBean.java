package org.primefaces.cookbook.controller.chapter2;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * TreeBean
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@Named
@ViewScoped
public class TreeBean implements Serializable {

	private TreeNode root;

	public TreeBean() {
		root = new DefaultTreeNode("Root", null);

		TreeNode node0 = new DefaultTreeNode("Tree node 0", root);
		node0.setExpanded(true);

		TreeNode node1 = new DefaultTreeNode("Tree node 1", root);
		new DefaultTreeNode("Tree node 2", root);

		TreeNode node00 = new DefaultTreeNode("Tree node 0.0", node0);
		node00.setExpanded(true);

		TreeNode node01 = new DefaultTreeNode("Tree node 0.1", node0);

		TreeNode node10 = new DefaultTreeNode("Tree node 1.0", node1);
		new DefaultTreeNode("Tree node 1.1", node1);

		TreeNode node000 = new DefaultTreeNode("Tree node 0.0.0", node00);
		node000.setExpanded(true);

		new DefaultTreeNode("Tree node 0.0.1", node00);
		new DefaultTreeNode("Tree node 0.1.0", node01);

		new DefaultTreeNode("Tree node 1.0.0", node10);
	}

	public TreeNode getRoot() {
		return root;
	}
}
