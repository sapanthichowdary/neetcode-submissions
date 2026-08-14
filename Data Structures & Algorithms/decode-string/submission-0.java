class Solution {
    public String decodeString(String s) {
        Stack<Integer>st_int = new Stack<>();
        Stack<StringBuilder> st_str = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;

        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                k = k * 10 + (ch-'0');
            }
            else if(ch=='[')
            {
                st_int.push(k);
                st_str.push(curr);
                k=0;
                curr = new StringBuilder();
            }
            else if(ch==']')
            {
                int count = st_int.pop();
                StringBuilder temp = st_str.pop();
                for(int i=0;i<count;i++)
                {
                    temp.append(curr);
                }
                curr = temp;
            }
            else
            {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}