// leetcode - 2239 - find closest number to zero

class Solution {
    public int findClosestNumber(int[] nums) {
       int closestNo=nums[0];
      for(int i=1; i<nums.length; i++){
        if(Math.abs(closestNo)==(nums[i])){
            closestNo=nums[i];
        }
        if(Math.abs(nums[i])<Math.abs(closestNo)){
            closestNo=nums[i];
        }
      }
      return closestNo;
    }
}