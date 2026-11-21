class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.size() == 0)
            return "";
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        if(str.length() == 0)
            return ans;

        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));
            int start = j+1;
            ans.add(str.substring(start,start+len));
            i=start+len;
        }
        return ans;
    }
}
