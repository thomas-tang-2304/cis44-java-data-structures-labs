public class Main {
    public static void main(String[] args) throws Exception {
        // Example usage of DynamicArray
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(10);
        dynamicArray.add(3);
        dynamicArray.add(555);
        dynamicArray.add(63);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(778);
        dynamicArray.add(85);
        dynamicArray.add(9);
        dynamicArray.add(777);
        dynamicArray.add(830);

        // The array should resize over this line
        dynamicArray.add(999);
        dynamicArray.add(9999);


        System.out.println("Element at index 10: " + dynamicArray.get(10)); 
        System.out.println("Size: " + dynamicArray.size()); 
        System.out.println("Removed element: " + dynamicArray.remove(1)); 
        System.out.println("Size after removal: " + dynamicArray.size()); 
        System.out.println("Element at index 9: " + dynamicArray.get(9));
    }
}
