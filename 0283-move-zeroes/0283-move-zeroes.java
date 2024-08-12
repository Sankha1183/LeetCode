class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l1 = 0;
        for (int l2 = 0; l2 < n; l2++) {
            if (nums[l2] != 0) {
                swap(nums, l1, l2);
                l1++;

            }
        }

    }

    void swap(int[] nums, int l1, int l2) {
        int temp = nums[l1];
        nums[l1] = nums[l2];
        nums[l2] = temp;

    }
}