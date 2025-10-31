import java.util.ArrayList;
import java.util.List;

public class BinaryTreeNode {
    String value; // Can be an operator "+" or an operand "3"
    BinaryTreeNode parent;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(String value) {
        this.value = value;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    // --- TO BE COMPLETED BY STUDENT ---

    /**
     * Performs a preorder traversal starting from this node.
     * (Visit Parent, then Left, then Right)
     * This should output Prefix notation.
     */
    @Override
    public String toString() {
        return value;
    }

    public void preorder(BinaryTreeNode node, List<BinaryTreeNode> orderList) {
        if(node == null) return;
        orderList.add(node);

        if(node.left != null) {

            preorder(node.left, orderList);
        }
        if(node.right != null) {

            preorder(node.right, orderList);
        }


    }

    public void traversePreorder() {
        // Your code here
        // 1. Print this node's value
        // 2. Recursively call on left child (if not null)
        // 3. Recursively call on right child (if not null)
        List<BinaryTreeNode> orderList = new ArrayList<>();
        preorder(this, orderList);
        for (BinaryTreeNode node : orderList) {
            System.out.print(node.toString() + " ");
        }

    }

    /**
     * Performs an inorder traversal starting from this node.
     * (Visit Left, then Parent, then Right)
     * This should output Infix notation (you can add parentheses for clarity).
     */
    
    public void inorder(BinaryTreeNode node, List<BinaryTreeNode> orderList) {
        if(node == null) return;

        
        if(node.left != null) {
            orderList.add(new BinaryTreeNode("("));
            
            inorder(node.left, orderList);
        }
        orderList.add(node);
        if(node.right != null) {
            
            inorder(node.right, orderList);
            orderList.add(new BinaryTreeNode(")"));
        }


    }
    public void traverseInorder() {
        // Your code here
        // (Optional: Print "(" before recursing left)
        // 1. Recursively call on left child (if not null)
        // 2. Print this node's value
        // 3. Recursively call on right child (if not null)
        // (Optional: Print ")" after recursing right)
        List<BinaryTreeNode> orderList = new ArrayList<>();
        inorder(this, orderList);
        for (BinaryTreeNode node : orderList) {
            System.out.print(node.toString() + " ");
        }
    }

    /**
     * Performs a postorder traversal starting from this node.
     * (Visit Left, then Right, then Parent)
     * This should output Postfix (RPN) notation.
     */
    public void postorder(BinaryTreeNode node, List<BinaryTreeNode> orderList) {
        if(node == null) return;
        
        if(node.left != null) {
            
            postorder(node.left, orderList);
        }
        if(node.right != null) {
            
            postorder(node.right, orderList);
        }
        orderList.add(node);


    }
    public void traversePostorder() {
        // Your code here
        // 1. Recursively call on left child (if not null)
        // 2. Recursively call on right child (if not null)
        // 3. Print this node's value

        List<BinaryTreeNode> orderList = new ArrayList<>();
        postorder(this, orderList);
        for (BinaryTreeNode node : orderList) {
            System.out.print(node.toString() + " ");
        }
    }
}