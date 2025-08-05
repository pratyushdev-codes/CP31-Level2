import java.util.*;

public class YouaregiventwoBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // consume newline
        while (T-- > 0) {
            String x = sc.nextLine();
            String y = sc.nextLine();

            // Reverse the binary strings
            StringBuilder xRev = new StringBuilder(x).reverse();
            StringBuilder yRev = new StringBuilder(y).reverse();

            int mv = 0;

            // Find the first position in reversed y with '1'
            for (int i = 0; i < yRev.length(); i++) {
                if (yRev.charAt(i) == '1') {
                    // Then in x, starting from that index, find the first '1'
                    for (int j = i; j < xRev.length(); j++) {
                        if (xRev.charAt(j) == '1') {
                            mv = j - i;
                            break;
                        }
                    }
                    break;
                }
            }

            System.out.println(mv);
        }
    }
}
