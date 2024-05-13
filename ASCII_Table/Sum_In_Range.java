// Find the Sum of the Numbers in a Given Range in Java

import java.util.*;

public class Sum_In_Range {
    public static void main(String[] args) {

        int a, b, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
