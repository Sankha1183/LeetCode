class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(n!=1 && !hs.contains(n) ){
            hs.add(n);
            int sum=0;
            while(n>0){
            int ld=n%10;
            sum+=ld*ld;
            n=n/10;
            }
            n=sum;
        
        }
        if(n==1){
            return true;
        }else return false;
        
    }
}