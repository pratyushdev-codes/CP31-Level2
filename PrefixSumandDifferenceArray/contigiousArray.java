import java.util.HashMap;
import java.util.Map;

public class contigiousArray {
    public static void main(String[] args) {
        
        int[] nums = {0, 1, 0, 1, 0, 1}; // Example input
        int maxLength = findMaxLength(nums);
        System.out.println("Maximum length of contiguous subarray with equal number of 0s and 1s: " + maxLength);




    }public static int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int subArrayLength = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) {
                subArrayLength = i + 1;
            } else if (mp.containsKey(sum)) {
                subArrayLength = Math.max(subArrayLength, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return subArrayLength;
    }
}



