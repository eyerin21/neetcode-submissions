class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            Integer j = hm.get(diff);
            if(j != null){
                ans[0] = i;
                ans[1] = j;
            }
            hm.put(nums[i],i);
        }
        Arrays.sort(ans);
        return ans;
    }
}
