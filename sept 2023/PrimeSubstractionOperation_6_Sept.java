// leetcode 2601 - Prime Substraction Operation

class Solution {
    public boolean primeSubOperation(int[] nums) {
        //if only 1 element: 
        int n = nums.length; 
        if(n == 1) return true;

        //if more than 1 elements, start from the end, for the last element
        // for the last element do nothing, because it will always make it difficult to generate the strictly increaseing array. 

        for(int i = n - 2; i >= 0; i--){
            //if current num[i] < nums[i+1]: do nothing, automatic satisfy condition. 
            if(nums[i] < nums[i + 1]) continue;
            else{
                int diff = nums[i] - nums[i+1];
                //need find the first prime between (diff + 1, nums[i] - 1)
                // if diff + 1 > nums[i] - 1: no such prime exist
                if(diff + 1 > nums[i] - 1) return false;

                //start checking number from (diff + 1) to (nums[i] - 1), pick the first prime number to substract from nums[i]
                //it will make the nums[i] - prime < nums[i + 1]

                int j = diff + 1, end = nums[i] - 1;

                for(; j <= end; j++){
                    if(isPrime(j)){
                        nums[i] = nums[i] - j;
                        break;
                    }
                }
                //no prime number found:
                if(j > end) return false;

            }
        }
        return true;
    }

    //a helper function to determine if a number is prime or not: 
    private boolean isPrime(int num){
        if(num == 1) return false;
        if(num == 2) return true;
        int sqrt = (int)Math.sqrt(num);
        for(int i = 2; i <= sqrt; i++){
            if(num % i == 0) return false; 
        }
        return true;
    }
}