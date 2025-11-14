class AVLNode {
    int key, height;
    AVLNode left, right;

    // Constructor
    AVLNode(int key) {
        // TODO: Initialize key, height, left, and right
        this.key = key;
        this.height = 0;
        
    }
}

public class AVLTree {

    AVLNode root;

    // TODO: Return height of a node
    int height(AVLNode N) {

        return (N == null) ? 0 : N.height;
    }

    void setHeight(AVLNode node) {
        if (node != null) {
            node.height = 1 + max(height(node.left), height(node.right));
        }
    }

    // TODO: Return maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b; 
    }

    // TODO: Compute balance factor
    int getBalance(AVLNode N) {
       
        
        if (N != null ) {
            return height(N.left) - height(N.right);
        }
       
        return 0; // placeholder
    }

    // TODO: Right rotation
    AVLNode rightRotate(AVLNode node) {
        AVLNode leftChild = node.left;
        AVLNode temp = leftChild.right;

        // Perform rotation
        leftChild.right = node;
        node.left = temp;

        // Update heights
        node.height = max(height(node.left), height(node.right)) + 1;
        leftChild.height = max(height(leftChild.left), height(leftChild.right)) + 1;

        // Return new root
        return leftChild;
    }

    // Left rotate subtree rooted with node
    AVLNode leftRotate(AVLNode node) {
        AVLNode rightChild = node.right;
        AVLNode temp = rightChild.left;

        // Perform rotation
        rightChild.left = node;
        node.right = temp;

        // Update heights
        node.height = max(height(node.left), height(node.right)) + 1;
        rightChild.height = max(height(rightChild.left), height(rightChild.right)) + 1;

        // Return new root
        return rightChild;
    }

    // TODO: Left-Right rotation
    AVLNode leftRightRotate(AVLNode z) {
        z.left = leftRotate(z.left);
        return rightRotate(z);
    }

    // TODO: Right-Left rotation
    AVLNode rightLeftRotate(AVLNode y) {
        y.right = rightRotate(y.right);
        return leftRotate(y);
    }

    // Public insert method
    public void insert(int key) {
        root = insert(root, key);
    }

    // TODO: Recursive insertion with rebalancing
    private AVLNode insert(AVLNode node, int key) {
        if (node == null){
            return new AVLNode(key);
        }

        if (key < node.key){
            node.left = insert(node.left, key);
        }else if (key > node.key){
            node.right = insert(node.right, key);
        }else {
            return node;
        }
        setHeight(node);

        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            return leftRightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            return rightLeftRotate(node);
        }

        return node; 
        
    }

    // TODO: Traversal methods
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(AVLNode node) {
        // leftRotate(node);
        if (node != null){
            if (node.left != null) {
                inorder(node.left);
                
            } 
            System.out.println(node.key + ", height = " + node.height);
            if (node.right != null) {
                inorder(node.right);
            }
        }
    }
    
    public void preorder() {
        preorder(root);
        System.out.println();
    }
    
    private void preorder(AVLNode node) {
        if (node != null){
            System.out.println(node.key + ", height = " + node.height);
            if (node.left != null) {
                preorder(node.left);
                
            } 
            if (node.right != null) {
                preorder(node.right);
            }
        }
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(AVLNode node) {
        if (node != null){
            if (node.left != null) {
                postorder(node.left);
                
            } 
            if (node.right != null) {
                postorder(node.right);
            }
            System.out.println(node.key + ", height = " + node.height);
        }
    }
}

