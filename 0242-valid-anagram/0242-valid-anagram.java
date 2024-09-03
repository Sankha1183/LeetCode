class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a1=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a1[ch-'a']++;
        }
         for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            a1[ch-'a']--;
        }

        for(int count:a1){
            if(count!=0){
                return false;
            }
        }
    return true;

    }
}