import java.util.ArrayList;
import java.util.List;

public class GeneralTreeNode {
    String name; // Employee name or department title
    GeneralTreeNode parent;
    List children;

    

    public GeneralTreeNode(String name) {
        this.name = name;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    // Method to add a child to this node
    public void addChild(GeneralTreeNode child) {
        child.parent = this;
        this.children.add(child);
    }

    public String getElement() {
       return this.name;
    }

    // --- TO BE COMPLETED BY STUDENT ---

    /**
     * Performs a preorder traversal starting from this node.
     * Prints the name of each node visited.
     * (Visit Parent, then visit children)
     */
      

    public static void preorder(GeneralTreeNode node, List<GeneralTreeNode> orderList) {
        if (node == null) return;
        orderList.add(node);
        
        if (node.children.size() > 0) {
            for (GeneralTreeNode child : (List<GeneralTreeNode>) node.children) {
                preorder(child, orderList);
            }
        }

    }
    public void traversePreorder() {
        // Your code here
        // 1. Print this node's name
        // 2. Recursively call traversePreorder on each child
        
        List<GeneralTreeNode> orderList = new ArrayList<>();
        preorder(this, orderList);
        for (GeneralTreeNode element : orderList) {
            System.err.println(element.getElement());
        }
    }

    /**
     * Performs a postorder traversal starting from this node.
     * Prints the name of each node visited.
     * (Visit children, then visit Parent)
     */

    public static void postOrder(GeneralTreeNode node, List<GeneralTreeNode> orderList) {
        if (node == null) return;
        
        if (node.children.size() > 0) {
            for (GeneralTreeNode child : (List<GeneralTreeNode>) node.children) {
                postOrder(child, orderList);
            }
        }
        
        orderList.add(node);

    }
    public void traversePostorder() {
        // Your code here
        // 1. Recursively call traversePostorder on each child
        // 2. Print this node's name

        List<GeneralTreeNode> orderList = new ArrayList<>();
        postOrder(this, orderList);

        for (GeneralTreeNode element : orderList) {
            System.err.println(element.getElement());
        }
    }
}
