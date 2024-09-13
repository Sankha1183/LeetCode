class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the input array
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0]; // Initialize the first element of the prefix sum

        // Fill prefixSum array
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int result = 0;
        for (int t_idx = 0; t_idx < n; t_idx++) {
            int freq = bsHelper(t_idx, nums, prefixSum, k);
            result = Math.max(freq, result);
        }

        return result;
    }

    // Helper method to calculate the maximum frequency for a target index
    private int bsHelper(int t_idx, int[] nums, int[] prefixSum, int k) {
        int target = nums[t_idx];
        int l = 0;
        int r = t_idx;
        int bestIdx = t_idx;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int count = (t_idx - mid + 1);
            int windowSum = count * target;
            int currSum = prefixSum[t_idx] - prefixSum[mid] + nums[mid]; // Handle prefix sum for mid > 0
            int ops = windowSum - currSum;

            if (ops > k) {
                l = mid + 1;
            } else {
                bestIdx = mid;
                r = mid - 1;
            }
        }

        return t_idx - bestIdx + 1;
    }
}
