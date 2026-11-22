class Solution {
    public boolean isPalindrome(String s) {
        // String str = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') ||
            (c >= 'A' && c <= 'Z') ||
            (c >= '0' && c <= '9')){
                sb1.append(Character.toLowerCase(c));
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = sb1.length()-1; i >= 0; i--){
            sb.append(sb1.charAt(i));
        }

        // System.out.println(str);
        // System.out.println(sb.toString());
        return ((sb1.toString()).equals(sb.toString()));
    }
}
