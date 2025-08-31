import java.util.*;

public class PrintAllDecodings {
    
    // helper to map numbers to letters
    public static char getCorresponding(int n) {
        return (char)(n + 'a' - 1);  // 1 -> 'a', 2 -> 'b', ..., 26 -> 'z'
    }

    // recursive function
    public static void decodings(String str, int idx, String current) {
        // base case: reached end of string
        if (idx == str.length()) {
            System.out.println(current);
            return;
        }

        // take one digit
        int oneDigit = str.charAt(idx) - '0';
        if (oneDigit >= 1 && oneDigit <= 9) {
            decodings(str, idx + 1, current + getCorresponding(oneDigit));
        }

        // take two digits (if possible)
        if (idx + 1 < str.length()) {
            int twoDigits = (str.charAt(idx) - '0') * 10 + (str.charAt(idx + 1) - '0');
            if (twoDigits >= 10 && twoDigits <= 26) {
                decodings(str, idx + 2, current + getCorresponding(twoDigits));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        decodings(str, 0, "");
    }
}
