class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            int remaining = target-sum;
                if(hm.containsKey(remaining)){
                    int ans = hm.get(remaining);
                return new int[]{i,ans};
                }
                else{
                    hm.put(nums[i],i);
                                    }
        }
       return new int[]{};

    }
}