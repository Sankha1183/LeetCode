class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(!isMatch(top,ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    boolean isMatch(char open,char close){
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}