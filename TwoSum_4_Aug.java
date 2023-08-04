// using Array - time complexity is 0(n2) since two for loops used
import java.util.*;

import java.util.*;
public class Solution {
  // time complexity O(n^2) | space complexity O(1)
  public static int[] twoSum(int[] numbers, int targetSum) {
      if (numbers == null || numbers.length < 2) {
        return null;
      }

      for (int i = 0; i < numbers.length; i++) {
        int diff = targetSum - numbers[i];
        for (int j = i + 1; j < numbers.length; j++) {
          if (numbers[j] == diff) {
            return new int[]{numbers[i], numbers[j]};
          }
        }
      }
      return null;
  }
  
  public static void main(String[] args){
    System.out.println(Arrays.toString(
      twoSum(new int[]{3, 6, 10, 14}, 9))); // [6, 3] best case

    System.out.println(Arrays.toString( 
      twoSum(null, 4))); // null - invalid input
    
    System.out.println(Arrays.toString(
      twoSum(new int[]{3, 1, 4}, 9))); // null - no pair exists

    System.out.println(Arrays.toString(
      twoSum(new int[]{3}, 9))); // null - array with less than two integers 
  }
}
// another approach
// class TwoSum {
//     public int[] twoSum1(int[] nums, int target) {
//         for(int i = 0; i<nums.length; i++){ //first pointer is fixed at i 
//             for(int j = i+1; j<nums.length;j++){ // second pointer is fixed at j which is one step ahead i
//                 if(nums[i]+nums[j]==target){ //addition of ith index and jth index is checked until sum equals target
//                     int a[]= {i,j}; //i and j index are stored in new array a
//                     return a; //the position of integers whose sum equals target are displayed 
//                 }
//                 }
//             }
//             throw new IllegalArgumentException(); //to avoid errors 
//         }
//         public int[] twoSum2(int[] nums, int target) {
//             Map<Integer, Integer> numMap = new HashMap<>(); //using map since it stores value in key value format and its time complexity is o(n)
//             // to create key value pairs
//             for(int i =0; i<nums.length; i++){
//                 numMap.put(nums[i],i);  //it will put array value at ith index as value and i as key
//             }
//             // to find the pair of indices whose value sum matches target- we will use approach as target- nums[i] = value to find in nums
//             for(int i =0; i<nums.length; i++){
//                 int numToFind = target - nums[i];
//             if(numMap.containsKey(numToFind) && numMap.get(numToFind)!=i){ //checking if numtofind value is therre in numMap and as well finding at what key or index it is there
//                 return new int[] {i, numMap.get(numToFind)};
//                 // int a[]={i,numMap.get(numToFind)}; //storing the keys in new array a
//                 // return a;
//             }
//             }
//             throw new IllegalArgumentException ("no pair found");
//     }
   