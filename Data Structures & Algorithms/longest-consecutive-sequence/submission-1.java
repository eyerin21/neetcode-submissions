class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }

        int maxCnt = 0;
        for(int i : nums){
            if(!hs.contains(i-1)){
                int x = i;
                int cnt = 1;
                while(hs.contains(x+1)){
                    x = x+1;
                    cnt++;
                }
                maxCnt = Math.max(maxCnt,cnt);
            }
        }
        return maxCnt;
    }
}
