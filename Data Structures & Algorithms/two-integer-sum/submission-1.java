class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){
            hm.put(nums[i],i);
        }

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(hm.containsKey(diff) && hm.get(diff) != i){
                ans[0] = i;
                ans[1] = hm.get(diff);
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
