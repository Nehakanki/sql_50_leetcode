class Solution {
    public int maxDepth(String s) {

        int n= s.length();
        
        int count =0;
        int countMain=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            countMain = Math.max(countMain,count);
        }
        return countMain;
        
    }
}