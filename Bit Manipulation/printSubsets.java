import java.util.Scanner;

public class printSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();                  // Read size of array
        int[] arr = new int[n];                // Create array of size n
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();             // Read array elements
        }

        for (int mask = 0; mask < (1 << n); mask++) { // Corrected loop variable (was `i` instead of `mask`)
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {   // Corrected condition (Java doesn't allow `if(mask & ...)` directly)
                    System.out.print(arr[i] + " "); // Use print instead of println to print on same line
                }
            }
            System.out.println();              // New line after each subset
        }
        
        sc.close(); // Always good practice to close Scanner
    }
}
