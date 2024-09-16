class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxEl(piles);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalHrs=helper(piles,mid);
            if(totalHrs<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private int maxEl(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }
    private int helper(int[] arr, int hourly){
        int  totalHrs=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            totalHrs+=Math.ceil((double)(arr[i])/(double)hourly);
        }
        return totalHrs;
    }
}