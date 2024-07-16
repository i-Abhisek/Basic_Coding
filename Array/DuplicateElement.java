//import java.util.*;
public class DuplicateElement {
    public int remDupli(int arr[], int n)
    {
      int res=1;
      for(int i=1;i<n;i++)
      {
        if(arr[i]!=arr[i-1])
        {
            arr[res]=arr[i];
            res++;
        }
      }
      return res;
    }
    public static void main(String[] args) {
        int arr[]={10, 20, 20, 30, 40, 40, 40, 50, 50};
        int n =arr.length;
        DuplicateElement duplicate = new DuplicateElement();
        int newLength=duplicate.remDupli(arr, n);
        for(int i=0;i<newLength;i++)
        {
            System.out.print(arr[i] + " " );
        }
    }

    
}
