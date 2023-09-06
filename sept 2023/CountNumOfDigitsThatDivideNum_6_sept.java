// leetcode 2520 - count the digits that divide the number

class Solution {
    public int countDigits(int num) {
        // Initialize a variable to keep track of the count of divisible digits.

        int count = 0;
        
        // Store the original value of 'num' for later comparison.

        int actualN = num;
        
        // Initialize a variable to store the individual digits.

        int digit = 0;
        
        // Loop through each digit of the number.

        while (num > 0) {
            // Extract the last digit of the number.

            digit = num % 10;
            
            // Check if the original number is divisible by the current digit.

            if (actualN % digit == 0) {
                // Increment the count if the digit is a divisor.
                count++;
            }
            
            // Remove the last digit by dividing the number by 10.

            num = num / 10;
        }
        

        // Return the count of divisible digits.

        return count;
    }
}