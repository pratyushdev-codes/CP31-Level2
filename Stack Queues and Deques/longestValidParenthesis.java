import java.util.Stack;

public class longestValidParenthesis {
    public static void main(String[] args) {
        
    }public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1); //base case
        int substringmaxLength =0;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                substringmaxLength= Math.max(substringmaxLength, i-st.peek());
                }
            }
        }
        return substringmaxLength;
    }
}

