class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            hm.put(numbers[i],i);
        }

        int[] ans = new int[2];
        for(int i=0; i<numbers.length; i++){
            if(hm.containsKey(target-numbers[i]) && i != hm.get(target-numbers[i])){
                ans[0] = i+1;
                ans[1] = hm.get(target-numbers[i])+1;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
