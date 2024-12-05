class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        // Handle edge cases for single element or first/last element being a peak
        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

        // Binary search for peak element
        int low = 0;
        int high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Compare mid with its right neighbor to decide the direction
            if (nums[mid] > nums[mid + 1]) {
                // Peak lies in the left half or at mid
                high = mid;
            } else {
                // Peak lies in the right half
                low = mid + 1;
            }
        }

        // Low and high converge to the peak element index
        return low;
    }
}
