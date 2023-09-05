// leetcode 2443 - Sum of Number and its reverse
class Solution {
    // creating reverse of a number
    int reverse(int num){
        int rev=0;
        while(num!=0){
            rev = rev*10+(num%10); 
            num/=10; //decreasing digit of num
        }
        return rev;
    }

    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }

        for(int i=1; i<num; i++){ //running loop till value of num
            if(i+reverse(i)==num){  //if sum of iteration number and reverse of iteration number is equal to num then true
                return true; 
            }
        }
        return false;
    }
}