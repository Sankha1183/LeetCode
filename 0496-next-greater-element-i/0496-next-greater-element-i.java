class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];
        
        while(!st.isEmpty() && st.peek()<=num){
            st.pop();
        }
        if(st.isEmpty()){
            mp.put(num,-1); 
        }else{
            mp.put(num, st.peek());
        }
        st.push(num);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = mp.get(nums1[i]);
        }
        return res;
    }
}