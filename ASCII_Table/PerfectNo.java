//Check Whether or Not the Number is a Perfect Number 

import java.util.*;
public class PerfectNo {
    public static void main(String[] args) {
        int n=6,sum=0;
        for (int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }

        }
        if(sum==n)
        {
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("it is not a perfect number");
        }

    }
    
}
