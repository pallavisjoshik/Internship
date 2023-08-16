public class Solution {
    public static int trailingZeroes(int n) {
        int count = 0; //for counting trailing zeros
        // calculating factorial
        // when a number is multiplied by 10 then we get a trailing zero
        // that is number of times 10 appear(or 2*5) 
        // since every second number is factor of 2- number of 10 will depend on number of 5
        // thus question is transformed to find power of 5 in n
        // Continue the loop until all factors of 5 in n! are counted
        while (n > 0) {
            n = n/5; // Divide n by 5 to count the number of factors of 5
            count += n; // Add the count of factors of 5 to the total count of trailing zeroes
        }

        return count; // Return the total count of trailing zeroes in n!
    
    }
    public static void main(String[]args){
        int n = 6;
        System.out.println(trailingZeroes(n));
    }
}