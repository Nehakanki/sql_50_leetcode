class Solution {
    public String removeOuterParentheses(String s) {
        int n= s.length();
       if(n<=2){
        return "";
       }
        StringBuilder sb = new StringBuilder();
        int count =1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>1){
                    sb.append('(');
                }
            }
            else{
                if(count>1){
                    sb.append(')');
                }
                count--;
            }
        }
        return sb.toString();
    }
}