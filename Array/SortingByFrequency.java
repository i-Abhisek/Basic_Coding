import java.util.*;

class SortingByFrequency
{
    public void printFreq(int arr[])
    {
        if(arr==null || arr.length==0)
        {
            return;
        } 
        
        Arrays.sort(arr);

        int i=1;
       int freq=1;
       int n=arr.length;
       while (i<n) {
        while (i<n && arr[i] == arr[i-1])
        {
            freq++;
            i++;
            
        }
        System.out.println(arr[i-1] +   "  " +        freq);
        i++;
        freq=1;
       }
       if(n==1 || arr[n-1] != arr[n-2])
       {
        System.out.println(arr[n-1] + " " + 1);
       }
    }
    public static void main(String[] args) {
        SortingByFrequency obj = new SortingByFrequency();
        int arr[]={30,20,30,10,20,20,};
        obj.printFreq(arr);
    }
}
   