import java.util.*;

public class rectangleFilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine(); // consume newline

            String[] grid = new String[n];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.nextLine();
            }

            String ans = "YES";

            if (grid[0].charAt(0) != grid[n - 1].charAt(m - 1)) {
                boolean impossible = true;

                // Check top and bottom row
                for (int j = 0; j < m - 1; j++) {
                    if (grid[0].charAt(j) != grid[0].charAt(j + 1) ||
                        grid[n - 1].charAt(j) != grid[n - 1].charAt(j + 1)) {
                        impossible = false;
                    }
                }
                if (impossible) {
                    ans = "NO";
                }

                impossible = true;
                // Check left and right column
                for (int i = 0; i < n - 1; i++) {
                    if (grid[i].charAt(0) != grid[i + 1].charAt(0) ||
                        grid[i].charAt(m - 1) != grid[i + 1].charAt(m - 1)) {
                        impossible = false;
                    }
                }
                if (impossible) {
                    ans = "NO";
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
