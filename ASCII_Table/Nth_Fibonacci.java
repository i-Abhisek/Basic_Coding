import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N to find the N-th Fibonacci number:");
        int n = scanner.nextInt();
        
        int fib = fibonacci(n);
        System.out.println("The " + n + "-th Fibonacci number is: " + fib);
    }
    
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
