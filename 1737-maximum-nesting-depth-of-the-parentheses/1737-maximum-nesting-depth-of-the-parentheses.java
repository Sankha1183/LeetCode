class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int max=0;
        int curr=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                curr++;
                max=Math.max(curr,max);            }
            else if(c==')'){
                curr--;
            }

        }
        return max;
    }
}