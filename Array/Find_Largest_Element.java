import java.util.*;
 /**
  * Find_Largest_Element
  */
 public class Find_Largest_Element {
 
    public static void main(String[] args) {
        int numbers[]={12,34,64,-87,64,34,23,56,-90};
        Arrays.sort(numbers);
        int largest= numbers[numbers.length-1];
        System.out.println("The largest element is " + largest);
    }
 }


 /*
  * 
  import java.util.Scanner;

public class Find_Largest_Element
{
  public static void main(String args[])
  {

     int arr[] = {12, 13, 1, 10, 34, 10};

     int max = arr[0];

     for(int i=0; i<arr.length; i++)
     {
       if(max < arr[i])
       {
          max = arr[i];
       }

     }

    System.out.print(max); 
  }
}
  */