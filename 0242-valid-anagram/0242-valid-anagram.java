class Solution {

    // 3. Using freq array
  
    public boolean isAnagram(String s, String t) {

    int len1 = s.length();
    int len2 = t.length();
    if(len1!=len2){
        return false;
    }
     int[] freq = new int[26]; //to store count of the freq


     for(int i =0;i<len1;i++){
        char c= s.charAt(i);
        freq[c -'a']++;
     }

     for(int i=0;i<len1;i++){
        char c = t.charAt(i);
        freq[c - 'a']--;
     }

     for(int count: freq){
       if(count!=0){
        return false;
       }
     }
     return true;
    }
}