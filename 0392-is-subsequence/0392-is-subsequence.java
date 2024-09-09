class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0;
        int r=0;
        int n=s.length();
        int m=t.length();

        while(l<n && r<m){
            if(t.charAt(r)==s.charAt(l)){
               l++; 
            }
            r++;
        }
        return l==n;
    }
}