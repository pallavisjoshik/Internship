// package com.java.collectioninjava;
import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        //we are using set here, since set time complexity is o(1) that is least and also set has unique values
        Set<Integer> numberSet = new HashSet<>();
        // we will run the program till number n is not equal to 1
        while(n!=1){
            // let n = 19
            int current = n; //initializing a dummy variable as n
            int sum = 0; //initialising the sum zero 
            //now we will run the program till current is not zero
            while(current!=0){
                int rem = current%10; //initialised another variable where we will store one digit of n i.e. 19%10=9
                sum = sum + (rem*rem); //taking 9*9 value in sum plus initial sum value , when the loop will run again sum will be 9+ rem*rem
                current = current/10; //so that the loop runs again for current = 1 and we get sum = 81+1
            }
            // now aftersum = 82, current =0 and loop will break
            // but n !=1 and thus main loop will continue
            // to avoid infinite loop , we need to see if sum eventually gets repeated value and ends in infinite loop
            // which would mean that n is not happy number and should return false
            if (numberSet.contains(sum)){ //checking if NumberSet has value of repeated value of sum
                return false; //means number is not happy number
            }
            n=sum; //if we get sum=1 then we need to assign to n so that the loop ends 
            numberSet.add(n); //we need to add n to its set
        }
        return true;  //means n is happy number
    }
}
public class HappyNumber {
   public static void main(String[]args){
    int num = 19;
    // int num = 2;
    Solution obj = new Solution();
    System.out.println(obj.isHappy(num));

   }
}
