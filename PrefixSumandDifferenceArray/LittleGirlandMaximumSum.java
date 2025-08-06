import java.util.*;
public class LittleGirlandMaximumSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i =0 ; i < n ; i++){
                arr[i] = sc.nextInt();
        }

        int diff [] = new int [n+1];

        int q= sc.nextInt();

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

   
           while(q-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();

            diff[l-1] +=1;
            diff[r] -=1;
        }

        for(int i =1 ; i < n ; i++){
            diff[i] += diff[i-1];
        }


        Arrays.sort(arr);
        Arrays.sort(diff, 0,n);

        long ans =0;
        for(int i =0 ; i < n ; i++){
            ans += (long)arr[i] * diff[i];
        }
          System.out.println(ans);
    }
}


// This is "Little Girl and Maximum Sum" - a greedy optimization problem. Here's the key insight:
// Problem Understanding

// You have an array of n numbers
// You get q queries, each asking for the sum of elements from position l to r
// You can rearrange the array elements to maximize the total sum of all query results

// The Strategy
// To maximize the total sum, you want to:

// Place the largest numbers in positions that are queried most frequently
// Place the smallest numbers in positions that are queried least frequently

// Step-by-Step Logic
// Step 1: Count how many times each position is queried
// javawhile (q-- > 0) {
//     int l = sc.nextInt();
//     int r = sc.nextInt();
//     c[l - 1] += 1;  // Mark start of range
//     c[r] -= 1;      // Mark end of range
// }
// This uses the difference array technique. Instead of incrementing every position in range [l,r], we:

// Add +1 at position l-1 (start of range)
// Add -1 at position r (after end of range)

// Step 2: Convert difference array to actual frequency counts
// javafor (int i = 1; i < n; i++) {
//     c[i] += c[i - 1];  // Prefix sum gives actual frequencies
// }
// This converts the difference array into the actual count of how many times each position is queried.
// Step 3: Greedy pairing
// javaArrays.sort(a);        // Sort numbers (smallest to largest)
// Arrays.sort(c, 0, n);  // Sort frequencies (smallest to largest)

// for (int i = 0; i < n; i++) {
//     answer += (long) a[i] * (long) c[i];  // Pair them up
// }
// Example Walkthrough
// Input:
// 4 3
// 1 2 3 4
// 1 2
// 2 4  
// 1 4
// Step 1 - Mark ranges in difference array:

// Query [1,2]: c becomes [1, 0, -1, 0, 0]
// Query [2,4]: c becomes [1, 1, -1, 0, -1]
// Query [1,4]: c becomes [2, 1, -1, 0, -1]

// Step 2 - Convert to frequencies:

// c[0] = 2
// c[1] = 2 + 1 = 3
// c[2] = 3 + (-1) = 2
// c[3] = 2 + 0 = 2

// So positions are queried: [2, 3, 2, 2] times respectively.
// Step 3 - Greedy pairing:

// Original array: [1, 2, 3, 4]
// Frequencies: [2, 3, 2, 2]
// After sorting both:

// Numbers: [1, 2, 3, 4]
// Frequencies: [2, 2, 2, 3]


// Pair smallest number with smallest frequency: 1×2 + 2×2 + 3×2 + 4×3 = 20

// Why this works: We want to maximize the sum, so we pair the largest numbers (which contribute most) with the highest frequencies (positions queried most often).
// Key Techniques Used:

// Difference Array: Efficiently mark ranges in O(1) per query
// Prefix Sum: Convert difference array to actual counts
// Greedy Algorithm: Pair largest values with highest frequencies