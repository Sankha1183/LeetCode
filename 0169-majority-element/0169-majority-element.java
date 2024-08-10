class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int cd=0;
        for(int num:nums){
            if(cnt==0){
                cd=num;
            }
            if(num==cd){
                cnt+=1;
            }else{
                cnt-=1;
            }
        }
        return cd;
    }
}