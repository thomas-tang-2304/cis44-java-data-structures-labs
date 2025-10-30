public class TextEditor {


    private static class Node {
        String textState;
        Node prev = null;
        Node next = null;
        public Node(String textState) {
            this.textState = textState;
            
        }
    }

    private Node currentNode;

    public TextEditor() {
        // Start with an initial empty string state.
        Node initialNode = new Node("");
        this.currentNode = initialNode;
    }

    public void add(String newText) {
        // Create a new node with the updated text.
        // Set its 'prev' to the current node.
        // Set the current node's 'next' to this new node.
        // Finally, update currentNode to point to the new node.

        Node newNode = new Node(newText);
        newNode.prev = currentNode;
        currentNode.next = newNode;
        
        currentNode = newNode;
    }

    public String undo() {
        // Check if currentNode.prev is not null.
        // If it is, move currentNode back and return the text.
        // Otherwise, you can't undo.

        if (currentNode.prev != null) {
            currentNode = currentNode.prev;
            return currentNode.textState;
        } else {
            return "Cannot undo";
        }
    }
    
    public String redo() {
        // Check if currentNode.next is not null.
        // If it is, move currentNode forward and return the text.

        if (currentNode.next != null) {
            currentNode = currentNode.next;
            return currentNode.textState;
        } else {
            return "Cannot redo";
        }
    }
    
    public void printCurrent() {
        System.out.println(currentNode.textState);
    }
}