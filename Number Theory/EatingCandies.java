import java.util.HashMap;
import java.util.Scanner;

public class EatingCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // number of candies
            int[] w = new int[n]; // array storing candy weights
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> hm = new HashMap<>(); // map to store suffix sum -> index
            int[] suffixSum = new int[n]; // suffix sum array
            int sum = 0;

            // build suffix sums (from right to left)
            for (int i = n - 1; i >= 0; i--) {
                sum += w[i];              // accumulate suffix sum
                suffixSum[i] = sum;       // store suffix sum at position i
                hm.put(sum, i);           // store sum with its index
            }

            int ans = 0;       // maximum candies eaten from both ends
            int prefixSum = 0; // prefix sum from left

            // traverse from left to right
            for (int i = 0; i < n; i++) {
                hm.remove(suffixSum[i]); // remove current suffix sum (to avoid overlap)
                prefixSum += w[i];       // accumulate prefix sum

                // if the same sum exists in suffix (means left sum == right sum)
                if (hm.containsKey(prefixSum)) {
                    // candies eaten = left part (i+1) + right part (n - index of suffix start)
                    ans = Math.max(ans, (i + 1) + (n - hm.get(prefixSum)));
                }
            }

            System.out.println(ans); // print result for this test case
        }
        sc.close();
    }
}
