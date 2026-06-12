class Solution {
    public int compress(char[] chars) {
      if(chars.length == 1){
            return 1;
        }
      int left = 0;
      int right = left + 1;
      int i = 0 ;
      while( left < chars.length ){
        
        while( right < chars.length &&  chars[left] == chars[right]) {   
            right ++;
            }
        
        chars[i++]=chars[left];
        String k = Integer.toString(right - left);
           
        if(right - left > 1 ){
            for(int j = 0 ; j < k.length() ; j++){
                chars[i++] = k.charAt(j);
            }   
        }
        left = right;
        right++;
           
        }

        return i;
    }
}
