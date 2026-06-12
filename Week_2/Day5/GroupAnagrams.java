class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        boolean[] visited = new boolean[strs.length];
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0 ; i < strs.length ; i++  ){
            if(visited[i]){
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true ;
            
            int freq[] = new int[26];
            for( char ch : strs[i].toCharArray()){
                freq[ch - 'a']++;
            }
            for(int j = i+1 ; j < strs.length ; j++){
                if(visited[j]){
                    continue;
                }
                int[] freq2 = new int[26];
                for( char ch : strs[j].toCharArray() ){
                    freq2[ch - 'a']++;
                }
                if(Arrays.equals(freq , freq2)){
                    group.add(strs[j] );
                    visited[j] = true;
                }
            }
            ans.add(new ArrayList<>(group));
        }
        return ans;
    }
}
