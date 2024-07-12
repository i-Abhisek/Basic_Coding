// Java program for longest palindrome in an array

import java.util.*;

public class LongestPalindrome{
    public static boolean isPallindrom(int n) {
        int rem, rev = 0, num = n;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return num == rev;
    }

    public static int largest(int arr[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = n - 1; i >= 0; --i) {
            if (isPallindrom(arr[i])) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter The Element In Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int larger = largest(arr, size);
        if (larger == -1) {
            System.out.println("There is no palindrome");
        } else {
            System.out.println("Longest palindrome number in the Array " + larger);
        }
        sc.close();
    }
}