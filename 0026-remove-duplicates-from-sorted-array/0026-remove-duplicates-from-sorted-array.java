class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int index=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i] != nums[i-1]){
                nums[index]=nums[i];
                index++;
                count++;
            }
        }
        return count;
        
    }
}