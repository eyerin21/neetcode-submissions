class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            int[] freq = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                freq[strs[i].charAt(j) - 'a']++;
            }
            String str = Arrays.toString(freq);
            List<String> tmp = hm.getOrDefault(str,new ArrayList<>());
            tmp.add(strs[i]);
            hm.put(str,tmp);
        }

        List<List<String>> ans = new ArrayList<>();

        for(String str : hm.keySet()){
            List<String> tmp = hm.get(str);
            ans.add(tmp);
        }
        return ans;
    }
}
