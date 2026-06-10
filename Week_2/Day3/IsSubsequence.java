class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0;
        for(int i = 0 ; i < t.length() && left < s.length() ; i++ ){
            if(s.charAt(left) == t.charAt(i)){
                left++;
            }
        }
        if(left == s.length())
            return true;


     return false;
    }
}
