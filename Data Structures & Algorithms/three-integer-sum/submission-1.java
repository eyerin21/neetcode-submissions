class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            Set<Integer> hs = new HashSet<>();
            int target = -nums[i];

            for(int j=i+1; j<nums.length; j++){
                int need = target - nums[j];
                if(hs.contains(need)){
                    ans.add(Arrays.asList(nums[i],nums[j],need));
                    while(j+1 < nums.length && nums[j] == nums[j+1])
                        j++;
                }
                hs.add(nums[j]);
            }
        }
        return ans;
    }
}
