public class Playlist {
    private static class Node {
        private Song song;
        private Node next;
        
        public Node(Song s, Node n) {
            this.song = s;
            this.next = n;
        }
    }

    private Node head;
    private Node tail;
    private Node currentNode;
    private int size;

    public Playlist() {
        this.head = null;
        this.tail = null;
        this.currentNode = null;
        this.size = 0;
    }

    public void addSong(Song song) {
        Node iterator = head;
        if (size == 0) {
            head = new Node(song, tail);
        } else {
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            tail = new Node(song, null);
            iterator.next = tail;
            iterator = tail;
        }
        size++;
    }

    public void removeSong(String title) {
        // Handle two cases: removing the head and removing from elsewhere.
        // Don't forget to update the tail if the last song is removed.
        
        if (size != 0) {
            Node iterator = head;
            Node previous = null;
            while(!(iterator.song.getTitle().equals(title))) {
                previous = iterator;
                iterator = iterator.next;
    
            }


            if (iterator == null) {
                throw new IllegalStateException("Song not found");
            } else {
                System.out.println("Successfully removed: " + iterator.song.getSong());
                if (previous != null) {

                    previous.next = iterator.next;
                } else {
                    head = iterator.next;
                }
                size--;
            }
            
        } else {
            throw new IllegalStateException("Playlist is empty");
        }
    }

    public void playNext() {

        // If currentNode is null, start from the head.
        // Otherwise, advance to the next node.
        // If you reach the end, loop back to the head.
        if (currentNode == null) {
            currentNode = head;
        } else {
            currentNode = currentNode.next;
            if (currentNode == null) {
                currentNode = head;
            }
        }
        System.out.println("Next Song: " + currentNode.song.getSong());
        System.out.println();
    }
    
    public void displayPlaylist() {
        Node iterator = head;
        while (iterator != null) {
            System.out.print(iterator.song.getSong() +  " -> ");
            iterator = iterator.next;
        }

        System.out.println("\nSong in Play list: " + size);
        System.out.println();
    }
}