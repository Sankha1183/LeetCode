class Solution {
    public List<List<Integer>> generate(int numRows) {
        
    ArrayList<List<Integer>> ans = new ArrayList<>();
    for(int row=0;row<numRows;row++){
        ArrayList<Integer> tempList=new ArrayList<>();
        for(int col=0;col<=row;col++){
            tempList.add(nCr(row,col));
        }
        ans.add(tempList);
    }
    return ans;

    }
    public int nCr(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}