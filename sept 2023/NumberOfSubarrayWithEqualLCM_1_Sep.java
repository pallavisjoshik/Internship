// leetcode-2470 - number of subarrays with lcm k
class Solution {
    // calculating GCD greatest common divisor two numbers a and b
    private int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b); 
    }

    // now calculating LCM of two numbers
    public int lcm(int a, int b){
        return (a*b)/gcd(a,b); //since we know a*b = lcm(a,b) * gcd(a,b)
    }
    // now our actual logic starts
    public int subarrayLCM(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        // considering all subarrays starting from i index and ending with j index
        for(int i = 0; i<n; i++){
            // initializing lcm as one to start with
            int currlcm = 1;
            for(int j =i; j<n; j++ ){
                currlcm = lcm(currlcm, nums[j]); //that is calculating lcm of nums[j] along with lcm of numbers till index j-1 already calculated
                ans += (currlcm==k)?1: 0;  //if the currlcm matches the required lcm (k) then wa can add one and increase count of subarray with same lcm
            }
        }
    return ans;
    }
}