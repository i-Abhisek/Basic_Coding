import java.util.Arrays;
public class Second_Smallest_Element {
    public static void main(String[] args) {
        int numbers[] = {12,76,89,76,90,34,58,14,56,14};
        Arrays.sort(numbers);
        int SecondSmallest=numbers[1];
        System.out.println("Second Smallest Element is " + SecondSmallest);
        
    }
    
}
