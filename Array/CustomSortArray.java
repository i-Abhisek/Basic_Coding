import java.util.Arrays;
import java.util.Collections;

public class CustomSortArray {

    public static void main(String[] args) {
        // Example array
        Integer[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Print the original array
        System.out.println("Original array:");
        printArray(numbers);

        // Sort the array as required
        customSortArray(numbers);

        // Print the sorted array
        System.out.println("Array after custom sort:");
        printArray(numbers);
    }

    public static void customSortArray(Integer[] array) {
        int n = array.length;
        int mid = n / 2;

        // Sort the first half in ascending order
        Arrays.sort(array, 0, mid);

        // Sort the second half in descending order
        Arrays.sort(array, mid, n, Collections.reverseOrder());
    }

    public static void printArray(Integer[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
