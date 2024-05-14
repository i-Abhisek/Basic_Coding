import java.util.*;

public class ReverseNo {
    public static void main(String[] args) {
        int num, rev = 0; // Initialize rev variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        num = sc.nextInt();
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem; // Update rev variable
            num = num / 10;
        }
        System.out.println("Reversed Number: " + rev); // Print the reversed number after the loop
    }
}
