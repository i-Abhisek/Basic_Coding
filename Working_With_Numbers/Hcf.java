package Working_With_Numbers;

import java.util.*;

public class Hcf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = (a < b) ? a : b;
        int hcf = 0;
        for (int i = min; i >= i; i--) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("GCD = " + hcf);
    }
}