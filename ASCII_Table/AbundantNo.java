//Check Whether or Not the Number is an Abundant Number
import java.util.Scanner;

public class AbundantNo {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        num = sc.nextInt();
        
        // Calculate the sum of proper divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        // Determine if the number is abundant
        if (sum > num) {
            System.out.println(num + " is an Abundant Number");
            System.out.println("The Abundance is: " + (sum - num));
        } else {
            System.out.println(num + " is not an Abundant Number");
        }
        
        //sc.close();
    }
}
