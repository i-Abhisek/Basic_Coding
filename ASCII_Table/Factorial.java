// Find Factorial of a given number

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }

}
