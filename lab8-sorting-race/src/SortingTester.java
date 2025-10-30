import java.util.Arrays;
import java.util.Random;

public class SortingTester {

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 25000, 50000, 100000};
        
        System.out.println("--- The Sorting Race ---");

        for (int n : sizes) {
            System.out.println("\n--- Testing for array size n = " + n + " ---");
            
            // TODO: Call your test methods for Average, Best, and Worst cases.
            runAndTimAllSorts(n);
        }
    }
    
    // TODO: Implement the runAndTimAllSorts helper method.
    public static void runAndTimAllSorts(int size) {
        int array[] = generateSortedArray(size);
        System.out.println("\n=============================  Best case  =============================");
        long startTimeNanos = System.nanoTime();

        System.out.println("\n--- Insertion sort ---");
        SortingAlgorithms.insertionSort(array);
        System.out.println("\n--- Selection sort ---");
        SortingAlgorithms.selectionSort(array);
        System.out.println("\n--- Merge sort ---");
        SortingAlgorithms.mergeSort(array);

        long endTimeNanos = System.nanoTime();
        long elapsedTimeNanos = endTimeNanos - startTimeNanos; // Elapsed time in nanoseconds
        System.out.println("Elapsed time: " + (elapsedTimeNanos / 1_000_000.0) + " ms"); // Convert to milliseconds



        array = generateReverseSortedArray(size);
        System.out.println("\n=============================  Worst case  =============================");
        startTimeNanos = System.nanoTime();

        System.out.println("\n--- Insertion sort ---");
        SortingAlgorithms.insertionSort(array);
        System.out.println("\n--- Selection sort ---");
        SortingAlgorithms.selectionSort(array);
        System.out.println("\n--- Merge sort ---");
        SortingAlgorithms.mergeSort(array);

        endTimeNanos = System.nanoTime();
        elapsedTimeNanos = endTimeNanos - startTimeNanos; // Elapsed time in nanoseconds
        System.out.println("Elapsed time: " + (elapsedTimeNanos / 1_000_000.0) + " ms");


        array = generateRandomArray(size);

        System.out.println("\n=============================  Average case =============================");
        startTimeNanos = System.nanoTime();


        System.out.println("\n--- Insertion sort ---");
        SortingAlgorithms.insertionSort(array);
        System.out.println("\n--- Selection sort ---");
        SortingAlgorithms.selectionSort(array);
        System.out.println("\n--- Merge sort ---");
        SortingAlgorithms.mergeSort(array);

        endTimeNanos = System.nanoTime();
        elapsedTimeNanos = endTimeNanos - startTimeNanos; // Elapsed time in nanoseconds
        System.out.println("Elapsed time: " + (elapsedTimeNanos / 1_000_000.0) + " ms");

    }

    public static int[] generateRandomArray(int size) {
        // Implementation provided in previous response
        Random javaRandom = new Random();
        int[] array = javaRandom.ints(size, 0,size).toArray();
       
        return array;
    }

    public static int[] generateSortedArray(int size) {
        // Implementation provided in previous response
        int[] array = generateRandomArray(size) ;
       
        Arrays.sort(array);
        
        return array;
    }

    public static int[] generateReverseSortedArray(int size) {
        int[] array = generateRandomArray(size) ;
        Arrays.sort(array);

        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        return array;
    }
}