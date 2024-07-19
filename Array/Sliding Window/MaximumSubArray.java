import java.util.*;
/**
 * MaximumSubArray
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to store:");
        int n = sc.nextInt();
        System.out.println("Enter The element in array:");
        int arr[] =new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The Size of K:");
        int k= sc.nextInt();
        int i=0,j=0,sum=0;
        int ans = Integer.MIN_VALUE;
        while (j<n)
         {
            sum= sum+arr[j];
            if(j-i+1 < k)
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                ans=Math.max(ans,sum);
                sum= sum-arr[i];
                i++;
                j++;
            }
        }
        System.out.println("The Maximum Sum of Sub Array of K " + k + " is " + ans);
    }
}