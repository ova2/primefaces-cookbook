package org.primefaces.cookbook.controller.chapter6;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 * ContextMenuController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class ContextMenuController implements Serializable {

	private TreeNode root;
	private TreeNode selectedNode;

	public ContextMenuController() {
		root = new DefaultTreeNode("Root", null);

		TreeNode node0 = new DefaultTreeNode("Folder 0", root);
		TreeNode node1 = new DefaultTreeNode("Folder 1", root);
		TreeNode node2 = new DefaultTreeNode("Folder 2", root);
		TreeNode node00 = new DefaultTreeNode("Folder 0.0", node0);
		TreeNode node01 = new DefaultTreeNode("Folder 0.1", node0);
		TreeNode node10 = new DefaultTreeNode("Folder 1.0", node1);
		new DefaultTreeNode("File 1.1", node1);
		new DefaultTreeNode("File 2.0", node2);
		new DefaultTreeNode("File 0.0.0", node00);
		new DefaultTreeNode("File 0.0.1", node00);
		new DefaultTreeNode("File 0.1.0", node01);
		new DefaultTreeNode("File 1.0.0", node10);
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
		selectedNode = event.getTreeNode();
	}

	public void onNodeUnselect(NodeUnselectEvent event) {
		selectedNode = null;
	}

	public void viewNode() {
		if (selectedNode == null) {
			return;
		}

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", selectedNode.getData().toString());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void deleteNode() {
		if (selectedNode == null) {
			return;
		}

		selectedNode.getChildren().clear();
		selectedNode.getParent().getChildren().remove(selectedNode);
		selectedNode.setParent(null);

		selectedNode = null;
	}

	public void save() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void update() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Updated", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void delete() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Deleted", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String doSomething() {
		// do something
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Done", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);

		return null;
	}
}
