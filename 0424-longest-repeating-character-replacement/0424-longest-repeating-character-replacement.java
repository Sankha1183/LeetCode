class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0;
        int r=0;
        int maxLen=0;
        int maxFr=0;
        int[] hash=new int[26];
        while(r<n){
            hash[s.charAt(r)-'A']++;
            maxFr=Math.max(maxFr,hash[s.charAt(r)-'A']);
            if((r-l+1)-maxFr>k){
                hash[s.charAt(l)-'A']--;
                maxFr=0;
                l++;
            }
            else if((r-l+1)-maxFr<=k){
                maxLen=Math.max(maxLen,r-l+1);

            }
            r++;
        }
        return maxLen;
    }
}