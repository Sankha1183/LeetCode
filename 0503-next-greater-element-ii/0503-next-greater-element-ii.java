class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] nge=new int[n];
        for(int i=0;i<n;i++){
            nge[i]=-1;
            for(int j=i+1;j<i+n;j++){
                int index=j%n;
                if(nums[index]>nums[i]){
                    nge[i]=nums[index];
                    break;
                }
            }
        }
        return nge;
    }
}