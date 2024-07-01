class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        //if we have (), (, ), ""
        if(n<=2) {
            return "";
        } //string to Array
        char c[]=s.toCharArray();
        int count=1;
        StringBuilder sb= new StringBuilder();
        //start with 2nd element so we can easily eliminate the 
       // count 1 (starting) vali condititon

       // "(" ke liye count++ and ")" ke liye count-- where count 0 means 
       // separtion

       for(int i=1;i<n;i++){
        
           if(c[i]=='('){
               count++;
               if(count>1) {
                   sb.append('(');
               } 

           }

           else{
               if(count>1) sb.append(')');
               count--;
           }
       }
        

        return sb.toString();
        
    }
}