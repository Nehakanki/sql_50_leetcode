class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet set = new HashSet<>();
        for(int x :nums1){
            set.add(x);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: nums2){
            if(set.contains(x)){
            list.add(x);
            set.remove(x);
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
       return arr;
    }
}