class Solution {
    public int search(int[] nums, int target) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                k = i;
                break;
            }
        }

        int low, high;
        if (k == 0) {
            low = 0;
            high = nums.length - 1;
        }
        else if (target >= nums[k] && target <= nums[nums.length - 1]) {
            low = k;
            high = nums.length - 1;
        } else {
            low = 0;
            high = k - 1;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
