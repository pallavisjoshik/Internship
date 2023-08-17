//leetcode 279
import java.util.*;
public class Solution {
    public static int numSquares(int n) {
        // creating an array to store number of squares required to sum to get index number
        int[] dp = new int[n+1];
        dp[0]= 0 ;
        dp[1]= 1 ; //for index 0 and 1, number of squares required will be 0 and 1 respectively
        for(int i= 2; i<=n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){ 
                int rem = i - j*j; 
                if(dp[rem]<min){
                    min = dp[rem];
                }
            }
            dp[i]= min + 1;
        }
        return dp[n];
    }
    public static void main(String[]args){
        int n = 16;
        System.out.println(numSquares(n));
    }
}