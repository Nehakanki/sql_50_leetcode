class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int n = strs.length;
        String start = strs[0];
        String end = strs[n-1];

        for(int i=0; i<Math.min(start.length(),end.length());i++){
           if(start.charAt(i) == end.charAt(i)){
            sb.append(start.charAt(i));
           } 
           else{
            return sb.toString();
           }
        }
        return sb.toString();
    }
}