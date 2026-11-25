class Solution {
    public String minWindow(String s, String t) {
        int left = 0, right = 0, cnt = 0, sIdx = -1, minLen = Integer.MAX_VALUE;
        int[] hash = new int[256];

        for(int i=0; i<t.length(); i++){
            hash[t.charAt(i)]++;
        }

        while(right < s.length()){
            char c = s.charAt(right);
            if(hash[c] > 0)
                cnt++;
            hash[c]--;

            while(cnt == t.length()){
                if(minLen > right-left+1){
                    minLen = right-left+1;
                    sIdx = left;
                }

                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)] > 0)
                    cnt--;
                left++;
            }           
            right++;
        }
        return sIdx == -1 ? "" : s.substring(sIdx,sIdx+minLen);
        
    }
}
