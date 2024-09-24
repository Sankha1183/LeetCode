class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character,Character> cmap=new HashMap<>();
        HashMap<Character,Character> dmap=new HashMap<>();
        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(cmap.containsKey(c1)){
                if(cmap.get( c1)!=c2){
                    return false;
                }
                }else{
                    cmap.put(c1,c2);
                }
            
            if(dmap.containsKey(c2)){
                if(dmap.get(c2)!=c1){
                    return false;
                }
                }else{
                    dmap.put(c2,c1);
                }
            }
        return true;
        

    }
}