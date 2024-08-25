class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int k=numbers[left]+numbers[right];
            if(k==target){
                return new int[]{left+1,right+1};
            }
            else if(k<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{1,1};
    }
}