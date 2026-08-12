class Solution {
    private boolean canEat(int n, int[] piles, int h)
    {
        int hours = 0;
        for(int num : piles)
        {
            if(num%n==0)
            {
                hours += num/n; 
            }
            else
            {
                hours += num/n + 1;
            }
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        while(low<high)
        {
            int mid = low+(high-low)/2;
            if(canEat(mid,piles,h))
            {
                high = mid;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
}
