class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0, right = 0;
        int maxLen = 0,  len = 0, maxFreq = 0;
        int[] hash = new int[26];
        
        while(right < n){
            char c = s.charAt(right);
            hash[c-'A']++;
            maxFreq = Math.max(maxFreq,hash[c-'A']);

            len = right-left+1;

            if(len - maxFreq > k){
                char ch = s.charAt(left);
                hash[ch - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
