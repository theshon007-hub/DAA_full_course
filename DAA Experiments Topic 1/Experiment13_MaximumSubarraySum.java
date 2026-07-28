import java.util.*;
public class Experiment13_MaximumSubarraySum {

    public static void main(String[] args) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSoFar = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.max(arr[i], current + arr[i]);
            maxSoFar = Math.max(maxSoFar, current);
        }

        System.out.println("Maximum Subarray Sum = " + maxSoFar);
    }
}