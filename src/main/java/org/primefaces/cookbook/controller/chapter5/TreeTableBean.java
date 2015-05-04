package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.model.chapter5.TreeTableElement;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.*;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/31/12
 */
@Named
@ViewScoped
public class TreeTableBean implements Serializable {

    private TreeNode root;

    private TreeNode selectedItem;
    private TreeNode selectedItem2;
    private TreeNode selectedItemForContextMenu;
    private TreeNode[] selectedItems;

    public TreeTableBean() {
        root = new DefaultTreeNode("root", null);

        TreeNode node1 = new DefaultTreeNode("node", new TreeTableElement("Node1", "N1 1st Column", "N1 2nd Column"), root);
        TreeNode node2 = new DefaultTreeNode("node", new TreeTableElement("Node2", "N2 1st Column", "N2 2nd Column"), root);

        TreeNode node11 = new DefaultTreeNode("leaf", new TreeTableElement("Node1.1", "N11 1st Column", "N11 2nd Column"), node1);
        TreeNode node12 = new DefaultTreeNode("leaf", new TreeTableElement("Node1.2", "N12 1st Column", "N12 2nd Column"), node1);

        TreeNode node21 = new DefaultTreeNode("node", new TreeTableElement("Node2.1", "N21 1st Column", "N21 2nd Column"), node2);
        TreeNode node211 = new DefaultTreeNode("leaf", new TreeTableElement("Node2.1.1", "N211 1st Column", "N211 2nd Column"), node21);
    }

    public void onNodeExpand(NodeExpandEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Expanded", event.getTreeNode().getData().toString());
    }

    public void onNodeCollapse(NodeCollapseEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Collapsed", event.getTreeNode().getData().toString());
    }

    public void onNodeSelect(NodeSelectEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Selected", event.getTreeNode().getData().toString());
    }

    public void onNodeUnselect(NodeUnselectEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Unselected", event.getTreeNode().getData().toString());
    }

    public void onColResize(ColumnResizeEvent event) {
        MessageUtil.addInfoMessageWithoutKey("Resized", event.getColumn().toString());
    }

    public void deleteNode() {
        selectedItem.getChildren().clear();
        selectedItem.getParent().getChildren().remove(selectedItem);
        selectedItem.setParent(null);

        selectedItem = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(TreeNode selectedItem) {
        this.selectedItem = selectedItem;
    }

    public TreeNode getSelectedItem2() {
        return selectedItem2;
    }

    public void setSelectedItem2(TreeNode selectedItem2) {
        this.selectedItem2 = selectedItem2;
    }

    public TreeNode getSelectedItemForContextMenu() {
        return selectedItemForContextMenu;
    }

    public void setSelectedItemForContextMenu(TreeNode selectedItemForContextMenu) {
        this.selectedItemForContextMenu = selectedItemForContextMenu;
    }

    public TreeNode[] getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(TreeNode[] selectedItems) {
        this.selectedItems = selectedItems;
    }
}
