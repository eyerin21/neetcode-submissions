class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
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
