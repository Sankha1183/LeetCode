class Solution {
    private static final int MOD=1000000007;
    public int countGoodNumbers(long n) {
        long evPos=(n+1)/2;
        long odPos=n/2;

        long evcnt=modPow(5,evPos,MOD);
        long odcnt=modPow(4,odPos,MOD);

        return (int)((evcnt*odcnt)%MOD);
        
    }
    private long modPow(long base,long exp,long mod){
        long res=1;
        long cb=base;
        while(exp>0){
            if(exp % 2!=0){
                res=(res*cb)%mod;
            }
            cb=(cb*cb)%mod;
            exp/=2;
        }
        return res;
    }
}