import java.util.Scanner;

public class AND0SumBig {
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // base
            int k = sc.nextInt(); // exponent

            long ans = 1;
            for (int i = 0; i < k; i++) {
                ans = (ans * n) % MOD;
            }

            System.out.println(ans);
        }
    }
}


// 🧠 Core Logic:
// This program computes 
// 𝑛
// 𝑘
// m
// o
// d
//  
//  
// (
// 10
// 9
// +
// 7
// )
// n 
// k
//  mod(10 
// 9
//  +7) for multiple test cases.

// 🔢 Variables:
// n: Base number.

// k: Exponent.

// MOD: 
// 10
// 9
// +
// 7
// 10 
// 9
//  +7, a large prime used to avoid overflow and maintain modularity.

// ans: Stores the result of 
// 𝑛
// 𝑘
// m
// o
// d
//  
//  
// 𝑀
// 𝑂
// 𝐷
// n 
// k
//  modMOD.

// 🔁 Loop Explanation:
// cpp
// Copy
// Edit
// for (int i = 0; i < k; i++) {
//     ans = (ans * n) % MOD;
// }
// This loop multiplies n to the answer k times, simulating the behavior of:

// 𝑎
// 𝑛
// 𝑠
// =
// 𝑛
// ×
// 𝑛
// ×
// 𝑛
// ×
// …
// (k times)
// =
// 𝑛
// 𝑘
// ans=n×n×n×…(k times)=n 
// k
 
// Each multiplication is done under modulo 
// 10
// 9
// +
// 7
// 10 
// 9
//  +7 to avoid integer overflow and keep the number within manageable limits.

// 📘 Why Modulo 
// 10
// 9
// +
// 7
// 10 
// 9
//  +7?
// It’s a large prime.

// Helps in keeping numbers within int or long range.

// Commonly used in competitive programming for modular arithmetic.

// ⚡ Time Complexity:
// The current method has O(k) time complexity.

// For large k, this could be slow.

// Optimized approach: Use modular exponentiation (Exponentiation by squaring) in O(log k) time.