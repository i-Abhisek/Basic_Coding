// to Check Leap Year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        int year=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter year");
      year=sc.nextInt();
      if(year%4==0 || year%400==0 && year%100!=0)
      {
        System.out.println(year+" is a leap year");
      }
      else{
        System.out.println(year+" is not a leap year");
      }

    }
    
}



// Bonus Boolean Method

/*
 * class LeapYear {

    public static void main(String[] args) {

        // If the year satisfies either of the conditions, it's considered a leap year -
        // 1. The year must be divisible by 400.
        // 2. The year must be divisible by 4 but not 100.
        int year = 2020;
        boolean leap;

        if (year % 400 == 0)
            leap = true;

        else if (year % 4 == 0 && year % 100 != 0)
            leap = true;

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
 */
