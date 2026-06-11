class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        
        StringBuilder sb = new StringBuilder() ;
        int num = 0 ;

        for(int i = 0 ; i < s.length() ; i++ ) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                num = num * 10 + s.charAt(i) - '0' ;
            }
            else if(s.charAt(i) == '[' ){
                countStack.push(num);
                strStack.push(sb);
                num = 0 ;
                sb = new StringBuilder(); 
            }
            else if(s.charAt(i) == ']'){
                int n = countStack.pop();
                StringBuilder wordstr = strStack.pop();
                for(int j = 0 ; j < n ; j++){
                    wordstr.append(sb);
                }
                sb = wordstr ;
            }else{
                sb.append(s.charAt(i) );
            }
        }
            return sb.toString();
    }
}
