class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        int n = nums.length/3;
        for(int num : map.keySet())
        {
            if(map.get(num)>n)
            {
                list.add(num);
            }
        }
        return list;
    }
}