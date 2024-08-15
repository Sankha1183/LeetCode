class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                return true;
            }
            
            // When duplicates are present
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } 
            // If the left half is sorted
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Search left
                } else {
                    low = mid + 1; // Search right
                }
            }
            // If the right half is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1; // Search right
                } else {
                    high = mid - 1; // Search left
                }
            }
        }
        
        return false;
    }
}
