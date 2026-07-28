import java.util.*;
class Experiment02_BinarySearch {

    static int binarySearch(int[] arr, int low, int high, int key) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;

        if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);

        return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};
        int key = 20;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result != -1)
            System.out.println("Key found at index " + result);
        else
            System.out.println("Key not found");
    }
}