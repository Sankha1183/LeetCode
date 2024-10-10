class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int max=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
                max=Math.max(max,st.size());
            }
            if(c==')'){
                if(!st.isEmpty()){
                st.pop();
                }
                
                
            }
        }
        return max;
    }
    
}