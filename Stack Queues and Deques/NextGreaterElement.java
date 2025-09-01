import java.util.*;

class NextGreaterElement {
    public int[] secondGreaterElement(int[] nums) {
        int n = nums.length;
        int[] sngr = new int[n];
        Arrays.fill(sngr, -1);

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s2.isEmpty() && nums[i] > nums[s2.peek()]) {
                sngr[s2.peek()] = nums[i];
                s2.pop();
            }

            Stack<Integer> temp = new Stack<>();
            while (!s1.isEmpty() && nums[i] > nums[s1.peek()]) {
                temp.push(s1.pop());
            }

            while (!temp.isEmpty()) {
                s2.push(temp.pop());
            }

            s1.push(i);
        }

        return sngr;
    }
}
