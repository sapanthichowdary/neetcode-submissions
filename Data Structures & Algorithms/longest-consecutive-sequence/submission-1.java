class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return 1;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int max_count  = 1;
        for(int num : set)
        {
            if(!set.contains(num-1))
            {
                int count = 1;
                int curr = num;
                while(set.contains(curr+1))
                {
                    curr++;
                    count++;
                }
                max_count = Math.max(max_count,count);
            }
        }
        return max_count;
    }
}
