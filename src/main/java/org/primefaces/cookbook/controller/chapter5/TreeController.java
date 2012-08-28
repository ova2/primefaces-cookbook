package org.primefaces.cookbook.controller.chapter5;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan
 * Date: 8/28/12
 */
@ManagedBean
@ViewScoped
public class TreeController implements Serializable {

    private TreeNode root;

    public TreeController() {
        root = new DefaultTreeNode("java.util.AbstractCollection", null);
        TreeNode node0 = new DefaultTreeNode("java.util.AbstractList", root);
        TreeNode node1 = new DefaultTreeNode("java.util.AbstractSet", root);

        TreeNode node00 = new DefaultTreeNode("java.util.AbstractSequentialList", node0);
        TreeNode node01 = new DefaultTreeNode("java.util.ArrayList", node0);
        TreeNode node02 = new DefaultTreeNode("java.util.Vector", node0);

        TreeNode node10 = new DefaultTreeNode("java.util.EnumSet", node1);
        TreeNode node11 = new DefaultTreeNode("java.util.HashSet", node1);
        TreeNode node12 = new DefaultTreeNode("java.util.TreeSet", node1);

        TreeNode node000 = new DefaultTreeNode("java.util.LinkedList", node00);
        TreeNode node020 = new DefaultTreeNode("java.util.Stack", node02);

        TreeNode node110 = new DefaultTreeNode("java.util.LinkedHashSet", node11);
    }

    public TreeNode getRoot() {
        return root;
    }
}

