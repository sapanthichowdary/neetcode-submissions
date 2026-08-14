class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        {
            return x;
        }
        int low = 2;
        int high = x/2;
        while(low<=high)
        {
            int mid = (low+high)/2;
            long sq = (long) mid*mid;

            if(sq==x)
            {
                return mid;
            }
            else if(sq>x)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return high;
    }
}