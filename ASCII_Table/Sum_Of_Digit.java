// Sum of digits of a number

import java.util.*;
public class Sum_Of_Digit {
    public static void main(String[] args) {
        int num = 12345, sum=0;
        while (num!=0)
        {
            sum +=num%10;
            num = num/10;
        }
        System.out.println("The sum of digits is " + sum);
    }
    
}

//Using Recursion I
/* 
 * public class Sum_Of_Digit
 {
   public static void main (String[]args)
   {

     int num = 12345, sum = 0;
       System.out.println ("Sum of digits : " + getSum (num, sum));
   }

   static int getSum (int num, int sum)
   {

     if (num == 0)
       return sum;

     sum += num % 10;
     return getSum (num / 10, sum);
   }
 }
 */
