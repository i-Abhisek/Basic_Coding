import java.util.*;
public class Find_Smallest_Element {
  public static void main(String[] args) {
    int numbers[] ={12,34,678,89,78,-3,-67,70};
    Arrays.sort(numbers);
    int smallest = numbers[0];
    System.out.println("The smallest element is " + smallest);
  }  
}
