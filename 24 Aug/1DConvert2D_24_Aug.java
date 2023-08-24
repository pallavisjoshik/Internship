// leetcode 2022 - convert 1d array to 2d

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len=original.length; //measuring length of original 1d array
        
        int[][] res=new int[m][n]; //creating the 2d array to store result
        // Total number of elements in 1D array will be equal to rows*columns of the 2D array. So first we compare and return an empty 2D array
        if(m*n!=len){
            return new int[0][0];
        }
        // we are adding the elements to the 2D array row wise. So we create new_c , an integer type variable to hold the value of the column.
        int new_c=0;
        
        //We need to enter the elements row wise
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=original[new_c];
                new_c++;  
            }
        }
        return res;
    }
}