import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's an Armstrong number:");
        int number = sc.nextInt();
        
        if(isArmstrong(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
    
    static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNumber;
    }
}
