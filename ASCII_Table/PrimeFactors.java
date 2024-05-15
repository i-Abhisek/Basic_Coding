// Program for Finding out the Prime Factors of a number 

import java.util.*;
/**
 * PrimeFactors
 */
public class PrimeFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        for (int i = 2; i < n; i+=1) {
            while (n%i==0) {
                n=n/i;
                System.out.println(i);
            }
        }
    }
}