class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        
        for (String op : ops) {
            if (op.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a + b);
            } else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } else if (op.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int score : st) {
            sum += score;
        }
        return sum;
    }
}
