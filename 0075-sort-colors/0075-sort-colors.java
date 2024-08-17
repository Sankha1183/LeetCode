class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l++,m++);    
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,m,h--);
                
            }
        }
        
    }
    void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}