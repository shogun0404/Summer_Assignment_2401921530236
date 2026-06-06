class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int left=0;
      int sum=0;
      double avg=0;
      int i=0; //subarray starting point
      while(i<k ){
        sum+=nums[i];
        i++;

      }
        avg=(double)sum/k;

      while(i<nums.length){
        sum=sum-nums[left++]+nums[i++];
        avg=Math.max(avg,(double)sum/k);
      }
      
        return avg;
    }
}
