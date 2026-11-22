class Solution {
    public boolean isPalindrome(String s) {
        // String str = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z') ||
            (c >= 'A' && c <= 'Z') ||
            (c >= '0' && c <= '9')){
                sb1.append(c);
            }
        }
        String str = sb1.toString().toLowerCase();
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println(str);
        System.out.println(sb.toString());
        if(str.equals(sb.toString()))
            return true;
        return false;

    }
}
