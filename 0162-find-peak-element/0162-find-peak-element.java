class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;


        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }

     
        int low = 0;
        int high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;

            
            if (nums[mid] > nums[mid + 1]) {
                
                high = mid;
            } else {
               
                low = mid + 1;
            }
        }


        return low;
    }
}
