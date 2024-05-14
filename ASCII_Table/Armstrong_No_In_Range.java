import java.util.Scanner;

public class Armstrong_No_In_Range {
    public static void main(String[] args) {
        int lowerValue, upperValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower value: ");
        lowerValue = scanner.nextInt();
        System.out.println("Enter the upper value: ");
        upperValue = scanner.nextInt();
        System.out.println("Armstrong numbers between " + lowerValue + " and " + upperValue + ":");
        for (int i = lowerValue; i <= upperValue; i++) {
            if(isArmstrong(i))
                System.out.println(i);
        }
    }

    static boolean isArmstrong(int num) {
        int originalNo = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;    
        }
        return sum == originalNo;
    }
}
