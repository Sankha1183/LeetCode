class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        // int j=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                l1.add(nums[i]);
                // j++;
                
            }
        }
        return l1;
    
        
    }
}