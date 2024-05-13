
// Even or Odd number
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter A Number: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("It is a even number");
        } else {
            System.out.println("It is a odd number");
        }

    }
}
