import java.util.*;
public class FindBoth {
    public static void main(String[] args) {
        int numbers[]={12,67,98,65,58,67,98,65};
        Arrays.sort(numbers);
        int largest = numbers[numbers.length - 1];
        int smallest = numbers[0];
        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);
    }
    
}
