// leetcode 2496 - Maximum value of a string in an array

class Solution {

    int check(String word){

        //default should be the length of word itself
        int maxVal = word.length();

        try {
            //if the word is valid numeric string, we will get its num representation as 'val'
            int val = Integer.parseInt(word);
            //if there exist some chars in 'word' exception will be thrown in above statement
            //hence this below statment will never reach and return would be then default length
            maxVal = val;
        } catch(NumberFormatException ex){
            //exception will come only if the word will contains some chars
            // System.out.println(ex);
        }
        return maxVal;
    }

    public int maximumValue(String[] strs) {
        
        int maxVal = 0;

        for(String word : strs) maxVal = Math.max(maxVal, check(word));
        
        return maxVal;
    }
}