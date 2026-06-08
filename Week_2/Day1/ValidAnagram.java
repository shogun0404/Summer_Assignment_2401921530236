class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() )
            return false;

        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            int idx = s.charAt(i) -'a';
            arr[idx]++;
        }
        for(int j = 0 ; j < t.length() ; j++){
            int idx = t.charAt(j) -'a';
            if(arr[idx]==0) return false;
            arr[idx]--;
        }
        return true;
    }
}
