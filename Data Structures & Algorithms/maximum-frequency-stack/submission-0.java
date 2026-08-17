class FreqStack {
    private HashMap<Integer,Integer> freqMap;
    private HashMap<Integer,Stack<Integer>> grp;
    private int max_freq;
    public FreqStack() {
        freqMap = new HashMap<>();
        grp = new HashMap<>();
        max_freq = 0;
    }
    
    public void push(int val) {
        int freq = freqMap.getOrDefault(val,0)+1;
        freqMap.put(val,freq);
        grp.computeIfAbsent(freq, f -> new Stack<>()).push(val);
        max_freq = Math.max(max_freq,freq);
    }
    
    public int pop() {
        Stack<Integer> st = grp.get(max_freq);
        int res = st.pop();
        freqMap.put(res,freqMap.get(res)-1);
        if(st.isEmpty())
        {
            max_freq--;
        }
        return res;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj          = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */