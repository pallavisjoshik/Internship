// leetcode-2427 - number of common factors

class Solution {
    public int commonFactors(int a, int b) {
        int commonFactors=0;
        // Common factors of a & b will be less than or equal to smallest of a & b only. therefore we take common factors till value of smallest only
        int smallest=a>b?b:a;
        // if a>b then take smallest as a otherwise take b

        // iterate over each number from 1 to the smallest element and Check if number is a common factor or not and increment count accordingly.
        for(int i=1;i<=smallest;i++)
        {
            if(a%i==0 && b%i==0) //if both a and divided by i gives zero as remainder then i is their factor
                commonFactors++;
        }
        return commonFactors;
    }
}