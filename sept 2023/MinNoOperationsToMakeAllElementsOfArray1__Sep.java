// leetcode 2654 - Minimum Number of operations to make all elements of array equal to 1


class Solution {
  
    // calculating GCD of two numbers
 private int gcd(int a, int b){
    if(b==0){
        return a;
    }
    return gcd(b, a%b);

 }

public int minOperations(int[] nums) {
    int n = nums.length; //calculating length of array
// gcd of any number and 1 will be always 1
// if there is one 1 in the array then all elements can be made 1 in n-1 steps
// simillaryly for m 1 in the array then all elements can be made 1 in n-m steps, since already 1 elements dont need to be converted
// therefore we will first count 1 in the array

    int oneCT = 0; //initializing count of 1 in array as zero
    for(int i=0; i<n; i++){
        oneCT += (nums[i]==1?1:0);  //if any element in array is equal to 1 then onecount is increased by one
    }
    if(oneCT>0){
        return n-oneCT; //since we will need operate only on elements that are not 1 and thus number of operations will be lessed by oneCT
    }
    // If don't have any 1 in the array then we will find the subarray with minimum no. of elements which will give the GCD as 1. 
    // Now that subarray will take j-i operations to make one integer in the array as 1. 
    // Once we have 1 in the array we can make the remaining array to 1 in N-1 operations. 
    // So our total no. of operations will be (j-i) + (N-1).
    int currLen = Integer.MAX_VALUE;
    for(int i=0;i<n; i++){
        int currGCD =0; //initializing current gcd as zero
        for(int j=i; j<n; j++){
            currGCD = gcd(currGCD, nums[j]); //calculating gcd of adjacent elements
            if(currGCD==1){
                currLen = Math.min(currLen, (j-i)+n-1); 
                break;
            }
        }
    }
currLen =  currLen==Integer.MAX_VALUE?-1:currLen;  //if we are not able to find any gcd equal to 1 then return -1 
return currLen;     
}
}