//import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int arr[]={12,40,9,65,90,34,16,47,7,10};
        int temp;
          for(int i=0; i<arr.length; i++)
          {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
          }
          for(int i=0; i<arr.length; i++)
          {
            System.out.print(arr[i] + " ");
          }
    }
    
}
