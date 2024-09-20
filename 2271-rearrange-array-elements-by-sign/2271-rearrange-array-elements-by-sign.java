class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []arr1=new int[n];
        int []arr2=new int[n];
        int count1=0;
        int count2=0;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr1[count1++]=nums[i];
            }else if(nums[i]<0){
                arr2[count2++]=nums[i];
            }
        }
        int []res=new int[n];
        int idx=0;
        int pidx=0;
        int nidx=0;
        while(pidx<count1 && nidx<count2){
            res[idx++]=arr1[pidx++];
            res[idx++]=arr2[nidx++];
            
        }
        return res;
    }
}