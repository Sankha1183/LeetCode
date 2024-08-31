class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=getMax(nums);
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumOfD(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private int sumOfD(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum;
    }
    int getMax(int[] nums){
            int max=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}