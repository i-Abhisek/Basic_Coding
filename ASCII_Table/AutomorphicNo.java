// Check Whether Or Not the Number is an Automorphic Number
import java.util.*;
public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = sc.nextInt();

        int l= (""+n).length();
        int sq = n *n;
        int end = sq %(int)Math.pow(10, 1);
        if(n==end)
        {
            System.out.println("It is Automorphic Number");
        }
        else{
            System.out.println("It is not Automorphic Number");
        }
    }
}
