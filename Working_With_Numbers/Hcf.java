package Working_With_Numbers;

import java.util.Scanner;

public class Hcf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = (a < b) ? a : b;
        int hcf = 1; // Initialize HCF to 1, as 1 is the minimum HCF

        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break; // Exit the loop once the HCF is found
            }
        }

        System.out.println("GCD = " + hcf);
        sc.close();
    }
}
