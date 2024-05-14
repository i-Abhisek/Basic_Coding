// Palindrome Program

import java.util.*;
/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        int num, rev=0,rem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        num = scanner.nextInt();

        int temp = num;
        while(temp !=0)
        {
            rem=temp%10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if (num == rev)
        System.out.println (num + " is Palindrome");
      else
        System.out.println (num + " is not Palindrome");
    }
}