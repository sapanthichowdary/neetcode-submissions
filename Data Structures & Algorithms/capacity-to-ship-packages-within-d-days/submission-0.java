class Solution {
    private boolean canShip(int n, int[] weights, int days)
    {
        int d = 1;
        int curr = 0;
        for(int w : weights)
        {
            if(curr + w > n)
            {
                d++;
                curr = w;
            }
            else
            {
                curr += w;
            }
        }
        return d<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int sum = 0;
        for(int num : weights)
        {
            sum += num;
        }
        int high = sum;
        while(low<high)
        {
            int mid = low+(high-low)/2;
            if(canShip(mid,weights,days))
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
}