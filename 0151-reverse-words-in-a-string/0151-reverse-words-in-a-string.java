class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        reverse(arr,0,n-1);
        int r=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=' '){
                if(r!=0) arr[r++]=' ';
                int l=r;
                while(i<n && arr[i]!=' '){
                    arr[r++]=arr[i++];
                }
                reverse(arr,l,r-1);
            }
        }
        return new String(arr,0,r);

        
    }
    private void reverse(char[] arr,int l,int r){
        while(l<r){
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
        }
       
    }
}