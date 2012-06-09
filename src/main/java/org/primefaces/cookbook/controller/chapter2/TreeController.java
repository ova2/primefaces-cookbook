package org.primefaces.cookbook.controller.chapter2;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.cookbook.controller.BaseController;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 * TreeController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class TreeController extends BaseController {

	private static final long serialVersionUID = 20120527L;

	private TreeNode root;

	public TreeController() {
		root = new DefaultTreeNode("Root", null);

		TreeNode node0 = new DefaultTreeNode("Very long not breaking tree node 0", root);
		node0.setExpanded(true);

		TreeNode node1 = new DefaultTreeNode("Very long not breaking tree node 1", root);
		new DefaultTreeNode("Very long not breaking tree node 2", root);

		TreeNode node00 = new DefaultTreeNode("Very long not breaking tree node 0.0", node0);
		node00.setExpanded(true);

		TreeNode node01 = new DefaultTreeNode("Very long not breaking tree node 0.1", node0);

		TreeNode node10 = new DefaultTreeNode("Very long not breaking tree node 1.0", node1);
		new DefaultTreeNode("Very long not breaking tree node 1.1", node1);

		TreeNode node000 = new DefaultTreeNode("Very long not breaking tree node 0.0.0", node00);
		node000.setExpanded(true);

		new DefaultTreeNode("Very long not breaking tree node 0.0.1", node00);
		new DefaultTreeNode("Very long not breaking tree node 0.1.0", node01);

		new DefaultTreeNode("Very long not breaking tree node 1.0.0", node10);
	}

	public TreeNode getRoot() {
		return root;
	}
}
