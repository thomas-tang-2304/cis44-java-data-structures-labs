import java.util.Arrays;
import java.util.Random;

public class SubarrayTester {

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 50000, 100000};

        
        System.out.println("--- Maximum Subarray Sum Algorithm Comparison ---");
        

        for (int n : sizes) {

            int array[] = generateRandomArrayWithNegatives(n);
            System.out.println("\n--- Testing for array size n = " + n + " ---");

            System.out.println("\n--- Brute force  ---");
            long startTimeNanos = System.nanoTime();

            MaxSubarraySolver.bruteForceMaxSum(array);

            long endTimeNanos = System.nanoTime();
            long elapsedTimeNanos = endTimeNanos - startTimeNanos; // Elapsed time in nanoseconds
            System.out.println("Elapsed time: " + (elapsedTimeNanos / 1_000_000.0) + " ms"); // Convert to milliseconds


            System.out.println("\n--- Kadane's Algorithm ---");
            startTimeNanos = System.nanoTime();

            MaxSubarraySolver.kadanesAlgorithmMaxSum(array);

            endTimeNanos = System.nanoTime();
            elapsedTimeNanos = endTimeNanos - startTimeNanos; // Elapsed time in nanoseconds
            System.out.println("Elapsed time: " + (elapsedTimeNanos / 1_000_000.0) + " ms"); // Convert to milliseconds
                

            // TODO: Generate a random array and time both algorithms.
            
        }
    }

    public static int[] generateRandomArrayWithNegatives(int size) {
        // Implementation provided in previous response
        Random javaRandom = new Random();
        int[] array = javaRandom.ints(size, -50,50).toArray();
        
        return array;
    }
}