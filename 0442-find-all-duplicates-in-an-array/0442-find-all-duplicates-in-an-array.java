class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                if(!l1.contains(nums[i])){
                    l1.add(nums[i]);
                }
            }
        }
        return l1;
    
        
    }
}