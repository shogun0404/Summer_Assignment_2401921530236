class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int zeros = 0;
     while(start < nums.length){
        if(nums[start] == 0) break;
        
        start++;

       }
       for(int i=start ; i<nums.length ; i++){
            if(nums[i] != 0){
                nums[start++]=nums[i];

            }else{
                zeros++;
            }
        }
        while(zeros != 0){
            nums[start++] = 0;
            zeros--;
        }

    }
}
