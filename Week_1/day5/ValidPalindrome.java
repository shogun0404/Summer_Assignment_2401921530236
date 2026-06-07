class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++ ){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || 
                (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || 
                (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {

                char ch = s.charAt(i);
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    ch = (char)(ch+32);
                }
                sb.append(ch);
            }
        }
        s=sb.toString();
        System.out.println(s);
        if(!s.equals(sb.reverse().toString()) )
            return false;


    return true;      
    }
}
