// Find the Factors of a Number

import java.util.*;
public class Factors_Of_No {
    public static void main(String[] args) {
        int num =10;
        for (int i = 1; i <= num; i++) {
            if(num % i ==0)
            {
                System.out.println(i+ "");
            }
        }
    }
    
}
