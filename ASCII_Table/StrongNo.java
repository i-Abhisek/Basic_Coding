// Check Whether or Not the Given Number is a Strong Number

import java.util.*;
public class StrongNo {
    public static void main(String[] args) {
        int num = 145, sum = 0, temp;
        int copy = num;
        
        while (num > 0) {
            temp = num % 10;
            sum += fact(temp);
            num /= 10;
        }
        
        if (copy == sum) {
            System.out.println("Yes, it is a strong number");
        } else {
            System.out.println("No, it is not a strong number");
        }
    }
    
    public static int fact(int y) {
        int f = 1;
        for (int i = y; i > 0; i--) {
            f *= i;
        }
        return f;
    }
}

