class Solution {
    public void moveZeroes(int[] nums) {
       int n=nums.length;
       int i=0;
       for(int j=0;j<n;j++){
        if(nums[j]!=0){
            swap(nums,i,j);
            i++;

        }
       } 
    }
    void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}