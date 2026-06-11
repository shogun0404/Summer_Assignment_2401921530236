class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        
        for(int r = 0 ; r < s.length() ; r++ ){
            if( s.charAt(r) == ' '){
                int right = r-1;
                while(right > left){
                    char ch = sb.charAt(left);
                    sb.setCharAt(left , s.charAt(right) );
                    sb.setCharAt(right , ch);
                    left++;
                    right--;
                }
                left= r+1;
            }
        }
       int  right = s.length()-1;

        while(right > left){
            char ch = sb.charAt(left);
            sb.setCharAt(left , s.charAt(right) );
            sb.setCharAt(right , ch);
            left++;
            right--;
        }
        
        return sb.toString();
    }
}
