class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> res = new PriorityQueue<>();
        for(int num : nums)
        {
            res.add(num);
        }
        int[] result = new int[nums.length];
        int i=0;
        while(!res.isEmpty())
        {
            result[i++] = res.poll();
        }
        return result;
    }
}