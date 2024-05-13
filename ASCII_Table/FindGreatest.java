import java.util.*;

public class FindGreatest {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        num2 = sc.nextInt();
        
        if (num1 == num2) {
            System.out.println("Both numbers are the same.");
        } else {
            int greatest = Math.max(num1, num2);
            System.out.println(greatest + " is greater.");
        }
    }
}
