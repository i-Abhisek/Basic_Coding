//Prime Number Program 

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean isprime = true;
        System.out.println("Enter The Number: ");
        n = sc.nextInt();

        if (n < 2) {
            isprime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }

            }
        }
        String result = isprime ? "Prime" : "not Prime";
        System.out.println("The number " + n + " is : " + result);

    }
}
