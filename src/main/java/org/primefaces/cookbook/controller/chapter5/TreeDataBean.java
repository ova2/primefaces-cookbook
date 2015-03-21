package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/28/12
 */
@Named
@ViewScoped
public class TreeDataBean implements Serializable {

    private TreeNode root;
    private TreeNode root2;
    private TreeNode rootWithType;

    private TreeNode selectedNode;
    private TreeNode selectedNode1;
    private TreeNode selectedNode2;
    private TreeNode[] selectedNodes;

    public TreeDataBean() {
        root = new DefaultTreeNode("Root", null);
        TreeNode node1 = new DefaultTreeNode("Node1", root);
        TreeNode node2 = new DefaultTreeNode("Node2", root);

        TreeNode node11 = new DefaultTreeNode("Node1.1", node1);
        TreeNode node12 = new DefaultTreeNode("Node1.2", node1);

        TreeNode node21 = new DefaultTreeNode("Node2.1", node2);
        TreeNode node211 = new DefaultTreeNode("Node2.1.1", node21);

        //root2
        root2 = new DefaultTreeNode("Root", null);
        TreeNode t2_node1 = new DefaultTreeNode("Node1", root2);
        TreeNode t2_node2 = new DefaultTreeNode("Node2", root2);

        TreeNode t2_node11 = new DefaultTreeNode("Node1.1", t2_node1);
        TreeNode t2_node12 = new DefaultTreeNode("Node1.2", t2_node1);

        TreeNode t2_node21 = new DefaultTreeNode("Node2.1", t2_node2);
        TreeNode t2_node211 = new DefaultTreeNode("Node2.1.1", t2_node21);

        // tree with node types
        rootWithType = new DefaultTreeNode("node", "Root", null);
        TreeNode node1_type = new DefaultTreeNode("node", "Node1", rootWithType);
        TreeNode node2_type = new DefaultTreeNode("node", "Node2", rootWithType);

        TreeNode node11_type = new DefaultTreeNode("leaf", "Node1.1", node1_type);
        TreeNode node12_type = new DefaultTreeNode("leaf", "Node1.2", node1_type);

        TreeNode node21_type = new DefaultTreeNode("node", "Node2.1", node2_type);
        TreeNode node211_type = new DefaultTreeNode("leaf", "Node2.1.1", node21_type);
    }

    public void displaySelected() {
        if(selectedNode != null) {
            MessageUtil.addInfoMessageWithoutKey("Selected", selectedNode.getData().toString());
        }

        if(selectedNodes != null && selectedNodes.length > 0) {
            StringBuilder builder = new StringBuilder();

            for(TreeNode node : selectedNodes) {
                builder.append(node.getData().toString());
                builder.append("<br />");
            }

            MessageUtil.addInfoMessageWithoutKey("Selected", builder.toString());
        }

        selectedNode = null;
        selectedNodes = null;
    }

    public void onNodeExpand(NodeExpandEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Expanded", event.getTreeNode().toString());
    }

    public void onNodeCollapse(NodeCollapseEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Collapsed", event.getTreeNode().toString());
    }

    public void onNodeSelect(NodeSelectEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Selected", event.getTreeNode().toString());
    }

    public void onNodeUnselect(NodeUnselectEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Unselected", event.getTreeNode().toString());
    }

    public void deleteNode() {
        selectedNode.getChildren().clear();
        selectedNode.getParent().getChildren().remove(selectedNode);
        selectedNode.setParent(null);

        selectedNode = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode getRoot2() {
        return root2;
    }

    public TreeNode getRootWithType() {
        return rootWithType;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    public TreeNode getSelectedNode1() {
        return selectedNode1;
    }

    public void setSelectedNode1(TreeNode selectedNode1) {
        this.selectedNode1 = selectedNode1;
    }

    public TreeNode getSelectedNode2() {
        return selectedNode2;
    }

    public void setSelectedNode2(TreeNode selectedNode2) {
        this.selectedNode2 = selectedNode2;
    }

    public TreeNode[] getSelectedNodes() {
        return selectedNodes;
    }

    public void setSelectedNodes(TreeNode[] selectedNodes) {
        this.selectedNodes = selectedNodes;
    }
}