// leetcode 136 - single num
// java solution
// class Solution {
//     public int singleNumber(int[] nums) {
//        int count = 0 ;
//         int N = nums.length ;
//         for (int i=0 ; i<N ; i++){
//              count = 0 ;
//             for (int j=0 ; j<N ; j++){
//                     if (nums[i]==nums[j]){
//                         count++ ;
//                  }
//             }  
//                 if (count==1){
//                     return nums[i] ;
//                 }
//             }
        
//         return 0 ;
//     }
// }

// javascript solution

// XOR all elements of Array. It will return unique element.
// XOR of same element results 0
// XOR with 0 and a number results that Number.
var singleNumber = function(nums) {
    let unique =0;
    for(let i=0;i<nums.length ;i++){
        unique = unique ^ nums[i];
    }

    return unique;
};