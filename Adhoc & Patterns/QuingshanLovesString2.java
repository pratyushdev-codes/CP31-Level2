import java.util.*;

public class QuingshanLovesString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (n % 2 == 1) {
                System.out.println(-1);
                continue;
            }

            Deque<Boolean> dq = new ArrayDeque<>();
            for (char c : s.toCharArray()) {
                dq.addLast(c == '1');
            }

            List<Integer> op = new ArrayList<>();
            int i = 0;

            while (!dq.isEmpty() && op.size() <= 300) {
                if (dq.peekFirst().equals(dq.peekLast())) {
                    if (!dq.peekFirst()) { 
                        op.add(i + dq.size());
                        dq.pollFirst();
                        dq.addLast(false);
                    } else {
                        op.add(i);
                        dq.addFirst(true);
                        dq.pollLast();
                    }
                } else {
                    dq.pollFirst();
                    dq.pollLast();
                }
                i++;
            }

            if (op.size() > 300) {
                System.out.println(-1);
            } else {
                System.out.println(op.size());
                for (int x : op) System.out.print(x + " ");
                System.out.println();
            }
        }

        sc.close();
    }
}
