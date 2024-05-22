import java.util.*;

public class Sorting_By_Freq {
    public static void main(String[] args) {
        int[] array = {10, 30, 10, 45, 90, 45, 30, 50, 67, 30, 90};

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()) == 0 ? a.getKey().compareTo(b.getKey()) : b.getValue().compareTo(a.getValue()));

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = list.get(0).getKey();
            list.remove(0);
        }

        System.out.println("Array sorted by frequency: " + Arrays.toString(sortedArray));
    }
}