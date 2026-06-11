class Solution {
    public List<String> generateParenthesis(int n) { 
        List<String> list = new ArrayList<>();
        build(list , "" , 0 , 0 , n);
        return list;
    }
    void build( List<String> list , String curr , int open , int close , int n){
        if(curr.length() == 2 * n ){
            list.add(curr);
            return;
        }
        if(open < n)
        build(list , curr + "(" , open+1 , close , n);
        if(close<open)
        build(list , curr + ")" , open , close+1 , n);
        return;    
        

        
    }
   
}
