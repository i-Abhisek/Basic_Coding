// import java.util.*;
// public class Reverse_Array {
//     public static void main(String[] args) {
//         int arr[] = {23,45,64,89,07,55,99};
//         int n= arr.length;
//         System.out.println("The Original Array: " + Arrays.toString(arr));
//         System.out.println("The Revers array is ");
//         for(int i=n-1;i>=0;i--) {
//             System.out.print(arr[i] + " ");
//         }
//     }
    
// }


/**
 * Reverse_Array
 */
public class Reverse_Array {

    public static void main(String[] args) {
        int arr[] = {23,45,64,89,07,55,87,90,99};
        int n = arr.length;
        int start=0, end=n-1;
        while (start < end) {
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}