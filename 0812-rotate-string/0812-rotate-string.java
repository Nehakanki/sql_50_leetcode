class Solution {
    public boolean rotateString(String s, String goal) {
            if(s.length()!= goal.length()){
                return false;
            }
        String sol = s + s;
        if(sol.contains(goal)){
            return true;
        }
        return false;
        
    }
}