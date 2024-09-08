class Solution {
    public int[] countBits(int n) {
        int[] arr= new int[n+1];

        for(int i=1;i<=n;i++){
            int count=i&1;
            int x=arr[i>>1];
            arr[i]=count+x;
        }
        return arr;
    }
}