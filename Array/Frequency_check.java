//import java.util.*;

public class Frequency_check {
    public static void main(String[] args) {
        int [] a={10,30,10,45,90,45,30,50,67,30,90};
        for (int i=0; i<a.length; i++) {
            int x =a[i];
            int count =0;
            if(x==-1) continue;
            for(int j=0; j<a.length; j++)
            {
                if(a[j]==x)
                {
                    count++;
                    a[j]=-1;
                }
            }
            System.out.println("The frequency of : "  + x  + " is " + count);
        }
    }
    
}
/*
 * import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 3, 2, 1, 4, 1, 3, 2, 5, 1, 3, 2, 4, 3};

        // Create a HashMap to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and count frequencies
        for (int num : array) {
            // Update the frequency count of 'num' in the map
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}

 */