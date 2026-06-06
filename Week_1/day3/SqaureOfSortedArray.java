class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1 ;
        int idx = right ;  //ending idx 
        while(idx >= 0){
            int num1=nums[left]*nums[left];
            int num2=nums[right]*nums[right];
            if(num1>num2){
                result[idx--] = num1 ;
                left++ ;
            }else{
                result[idx--] = num2 ; 
                right-- ;
            }
        }
        return result;
        
    }
}
