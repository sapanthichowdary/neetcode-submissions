class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j = heights.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j)
        {
            int h = Math.min(heights[i],heights[j]);
            int w = j-i;
            max = Math.max(max,h*w);
            if(heights[i]<=heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max;
    }
}
