// leetcode 2063- vowels of all substrings
class Solution {
    public long countVowels(String word) {
        long len = word.length();
        long out=0;
        for(int i=0;i<len;i++){
            char x = word.charAt(i);
            
            // Number of susbstrings in which the vowel at word.charAt(i) will occur will be its own substrings i.e. len-i and in the substrings of previous elements .Number of elements before it will be i and (len-i) will be the susbtrings in which it will occur.

            if(x=='a' || x=='e' || x=='i' || x=='o'|| x=='u'){
                out+=(i+1)*(len-i);
            }
        }
        return out;
    }
}