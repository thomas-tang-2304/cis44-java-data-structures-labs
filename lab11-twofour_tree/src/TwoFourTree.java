import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Simplified node structure
class TwoFourNode {
    List<Integer> keys;
    List<TwoFourNode> children;
    TwoFourNode parent;

    public TwoFourNode() {
        keys = new ArrayList<>();
        children = new ArrayList<>();
        parent = null;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    // Check if node is full (3 keys)
    public boolean isFull() {
        return keys.size() == 3;
    }

    // Find correct child to descend for a given key
    public TwoFourNode getNextChild(int key) {
        // TODO: Implement traversal logic
        int i = 0;
        while (i < keys.size() && key > keys.get(i)) {
            i++;
        }
        return children.get(i);
    }

    // Insert a key into this node (assume node not full)
    public void insertKey(int key) {
        // TODO: Add key and sort
        keys.add(key);
        Collections.sort(keys);
    }

}

public class TwoFourTree {

    private TwoFourNode root;

    public TwoFourTree() {
        root = new TwoFourNode();
    }

    public void insert(int key) {
        TwoFourNode node = root;

        // 1. Descend to the leaf node
        while (!node.isLeaf()) {
            node = node.getNextChild(key);
        }

        // 2. Insert key in leaf
        node.insertKey(key);

        // 3. Handle overflow by splitting
        while (node != null && node.keys.size() > 3) {
            split(node);
            node = node.parent;
        }
    }

    private void split(TwoFourNode node) {
        // TODO: Implement split logic
        // 1. Create a new right node
        TwoFourNode newRightNode = new TwoFourNode();

        // 2. Promote middle key to parent
        newRightNode.keys.add(node.keys.get(1));
        

        // 3. Move keys and children appropriately
        TwoFourNode node1 = new TwoFourNode();
        node1.insertKey(node.keys.get(0));
        newRightNode.children.add(node1);
        TwoFourNode node2 = new TwoFourNode();
        node2.insertKey(node.keys.get(2));
        newRightNode.children.add(node2);
        
        
        // 4. Update parent pointers
        newRightNode.parent = node.parent;
        System.out.println("=-==========================================================");
        System.out.println("middle key: " + node.keys.get(1));
        System.out.println("left child: " + newRightNode.children.get(0).keys.get(0));
        System.out.println("right child: " +newRightNode.children.get(1).keys.get(0));
        System.out.println("Splitting node with keys: " + newRightNode.keys);
        System.out.println("=-==========================================================");
    }

    // Inorder traversal
    public void inorder() {
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
    }

    private void inorder(TwoFourNode node) {
        if (node == null) return;

        if (node.isLeaf()) {
            for (int key : node.keys) {
                System.out.print(key + " ");
            }
        } else {
            int i;
            for (i = 0; i < node.keys.size(); i++) {
                if (i < node.children.size()) {
                    inorder(node.children.get(i));
                }
                System.out.print(node.keys.get(i) + " ");
            }
            if (i < node.children.size()) {
                inorder(node.children.get(i));
            }
        }
    }

    
}
