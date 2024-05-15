// Harshad number or not

import java.util.Scanner;

public class HarshadNo {
    public static void main(String[] args) {
        int num, rem, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        num = sc.nextInt();
        
        int temp = num; // Initialize temp after reading num

        // Calculate the sum of the digits of num
        while (temp > 0) {
            rem = temp % 10;
            sum += rem;
            temp = temp / 10;
        }

        // Check if the number is a Harshad number
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number");
        } else {
            System.out.println(num + " is not a Harshad Number");
        }
        
        sc.close();
    }
}
