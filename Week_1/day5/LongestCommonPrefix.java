class Solution {
    public String longestCommonPrefix(String[] strs) {
        String small=strs[0];
        String large=strs[0];
        for(int i=1 ; i<strs.length ; i++){
           if(strs[i].compareTo(small) < 0 )
                small=strs[i];
           if(strs[i].compareTo(large) > 0)
                large=strs[i] ;
        }
        int idx=0;
        while(idx < small.length() && idx <large.length() ){
            if(small.charAt(idx) != large.charAt(idx) )
                break;
            idx++;
        }
        return small.substring(0,idx);
        
    }
}
