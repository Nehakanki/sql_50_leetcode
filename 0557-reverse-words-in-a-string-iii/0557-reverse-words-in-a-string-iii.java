class Solution {
    public String reverseWords(String s) {
      
        String ch[] = s.split(" ");
         StringBuilder ans= new StringBuilder();

        for(int i=0;i<ch.length;i++){
            
            
            String a = ch[i];
            StringBuilder sb = new StringBuilder(a);
           StringBuilder rev= sb.reverse();
        ans.append(rev);
        int n= ch.length;
        if(i!=n-1){
            ans.append(" ");
        }

        }
        return ans.toString();



    }
}