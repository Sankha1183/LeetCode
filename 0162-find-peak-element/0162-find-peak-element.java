class Solution {
    public int findPeakElement(int[] nums) {
    int n=nums.length;
    int res=0;
    for(int i=0;i<n;i++){
        if((i==0 || nums[i-1]<nums[i]) && (i==n-1 || nums[i]>nums[i+1])){
            res=i;
        }
    }
    return res;
    }
}