import java.util.Collections;
import java.util.PriorityQueue;

public class kthlargestElementinArray {
    public static void main(String[] args) {
        
    }public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : nums) {
            pq.add(num);
        }
        
        // Poll k-1 times
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        
        return pq.peek();
    }
}
