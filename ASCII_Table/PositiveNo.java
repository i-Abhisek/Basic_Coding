// Positive or Negative number
import java.util.*;
class PositiveNo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("Enter number:");
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println("The number is negative");
        }
        else if(n==0)
        {
            System.out.println("The number is Zero");
        }
        else
        {
            System.out.println("The number is positive");
        }



    }
}