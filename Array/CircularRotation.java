import java.util.*;

public class CircularRotation {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // In case k is greater than the length of the array
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    } 

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        CircularRotation cr = new CircularRotation();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        cr.rotate(nums, k);
        System.out.println(Arrays.toString(nums));  // Output: [5, 6, 7, 1, 2, 3, 4]
        
    }
}
