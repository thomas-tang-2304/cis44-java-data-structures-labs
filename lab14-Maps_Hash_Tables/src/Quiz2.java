public class Quiz2 {
    public void main (String[] args) {

        // Quiz 2
        SeparateChainingMap hashTable = new SeparateChainingMap<>();
        hashTable.put(0, 32);
        hashTable.put(0, 15); // collided
        hashTable.put(0, 12); // collided
        hashTable.put(4, 12);
        hashTable.put(15, 55);

        hashTable.put(33, 55);

        hashTable.put(26, 12);

        hashTable.put(4, 65); // collided

        hashTable.put(9, 99); 
        hashTable.put(10, 100); 
        hashTable.put(32, 82); 
        hashTable.print();
        
    }
}
