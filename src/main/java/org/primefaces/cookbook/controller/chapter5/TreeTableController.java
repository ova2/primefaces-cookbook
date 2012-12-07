package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.cookbook.model.chapter5.TreeTableElement;
import org.primefaces.cookbook.utils.MessageUtil;
import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/31/12
 */
@ManagedBean
@ViewScoped
public class TreeTableController implements Serializable {

    private TreeNode root;

    private TreeNode selectedItem;
    private TreeNode selectedItemForContextMenu;
    private TreeNode[] selectedItems;

    public TreeTableController() {
        root = new DefaultTreeNode("root", null);

        TreeNode node1 = new DefaultTreeNode("node", new TreeTableElement("Node1", "1st Column", "2nd Column"), root);
        TreeNode node2 = new DefaultTreeNode("node", new TreeTableElement("Node2", "1st Column", "2nd Column"), root);

        TreeNode node11 = new DefaultTreeNode("leaf", new TreeTableElement("Node1.1", "1st Column", "2nd Column"), node1);
        TreeNode node12 = new DefaultTreeNode("leaf", new TreeTableElement("Node1.2", "1st Column", "2nd Column"), node1);

        TreeNode node21 = new DefaultTreeNode("node", new TreeTableElement("Node2.1", "1st Column", "2nd Column"), node2);
        TreeNode node211 = new DefaultTreeNode("leaf", new TreeTableElement("Node2.1.1", "1st Column", "2nd Column"), node21);
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
