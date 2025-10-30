import java.util.Arrays;
import java.util.Random;

public class MaxSubarraySolver {

    /**
     * Finds the maximum subarray sum using a brute-force approach.
     * Theoretical Complexity: O(n^2)
     */
    public static int bruteForceMaxSum(int[] arr) {
        // TODO: Implement the O(n^2) brute-force algorithm.

        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

        }

        return maxSum; // Placeholder
    }

    /**
     * Finds the maximum subarray sum using Kadane's Algorithm.
     * Theoretical Complexity: O(n)
     */
    

    public static int kadanesAlgorithmMaxSum(int[] arr) {
        // TODO: Implement the O(n) Kadane's Algorithm.

        // the iconic of this algorithm is setting the first element to arr[0]
        int maxSum = arr[0];
       

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {

                currentSum  += arr[j]; // then add the maxSum with arr[j] and store it in currentSum
                if (currentSum > maxSum) {

                    maxSum = currentSum;
                  
                }
            }
            

        }
        return maxSum; // Placeholder
    }

}
