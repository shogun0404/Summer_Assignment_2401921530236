class Solution {
    int start = 0 ;
    int maxlen = 0;
    public String longestPalindrome(String s) {
        for(int i = 0 ; i < s.length() ; i++){
            check(s,i,i); 
            check(s,i,i+1);
        }
        return s.substring(start , start + maxlen);
    }
    void check(String s , int left ,int right){
        while( left >= 0 && right < s.length()  && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        if(right - left - 1 > maxlen ){
            maxlen = right - left - 1;
            start = left + 1 ;
        }
    }
}
