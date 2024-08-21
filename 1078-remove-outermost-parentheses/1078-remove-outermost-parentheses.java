class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int count=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n-1;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(count>0){
                 res.append(ch);
                }
             count++;  
            }
            else if(ch==')'){
                count-=1;
                if(count>0){
                res.append(ch);
                }
            }
        }
        return res.toString();
    }
}