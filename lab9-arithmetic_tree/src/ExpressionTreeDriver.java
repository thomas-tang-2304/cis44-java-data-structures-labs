
public class ExpressionTreeDriver {
    public static void main(String[] args) {
        // 1. Build the Tree
        // Manually build the tree for: ( (3 + 7) * (9 - 4) )
        //
        //         *
        //        / \
        //       +   -
        //      / \ / \
        //     3  7 9  4
        //
        
        BinaryTreeNode root = new BinaryTreeNode("*");
        
        BinaryTreeNode nodePlus = new BinaryTreeNode("+");
        BinaryTreeNode nodeMinus = new BinaryTreeNode("-");

        BinaryTreeNode number3 = new BinaryTreeNode("3");
        BinaryTreeNode number7 = new BinaryTreeNode("7");
        BinaryTreeNode number9 = new BinaryTreeNode("9");
        BinaryTreeNode number4 = new BinaryTreeNode("4");

        root.left = nodePlus;
        root.right = nodeMinus;

        nodePlus.left = number3;
        nodePlus.right = number7;

        nodeMinus.left = number9;
        nodeMinus.right = number4;
        
        // --- TO BE COMPLETED BY STUDENT ---
        // Connect root, nodePlus, and nodeMinus
        // root.left = ...
        // root.right = ...
        // nodePlus.parent = ...

        // Create and connect the leaves (operands)
        // BinaryTreeNode node3 = new BinaryTreeNode("3");
        // BinaryTreeNode node7 = new BinaryTreeNode("7");
        // ...
        
        // Connect leaves to their parents (nodePlus and nodeMinus)
        // nodePlus.left = ...
        // nodePlus.right = ...
        // node3.parent = ...


        // 2. Perform Traversals
        System.out.println("--- Preorder Traversal (Prefix) ---");
        root.traversePreorder();

        System.out.println("\n\n--- Inorder Traversal (Infix) ---");
        root.traverseInorder();

        System.out.println("\n\n--- Postorder Traversal (Postfix) ---");
        root.traversePostorder();
    }
}