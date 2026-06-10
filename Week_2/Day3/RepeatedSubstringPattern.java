class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = 1 ; i <= n/2 ; i++){
            if( n % i != 0)
                continue;

            String temp = s.substring(0,i);
            StringBuilder sb = new StringBuilder();

            while(sb.length() < n){
                sb.append(temp);
            }
            if(sb.toString().contains(s)){
                return true;
            }
        }

        return false;
        
    }
}
