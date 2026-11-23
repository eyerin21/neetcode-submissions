class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, n = s.length();
        HashSet<Character> hs = new HashSet<>();
        int maxCnt = 0;
        
        while(right < n){
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            maxCnt = Math.max(maxCnt, right-left+1);
            right++;
        }
        return maxCnt;
    }
}
