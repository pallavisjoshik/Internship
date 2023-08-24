// leetcode - Longest word in dictionary

class Solution {
    public String longestWord(String[] words) {
        /*
            Using a hashset because i want to search for substring with O(1) complexity
            I will be storing the words in a hashset and then i will making all possible
            substrings and checking if all of them are present in the hashset
            
            If all of them are present then we can reassign the value of res.
        */
        Set<String> set=new HashSet<>();
        for(String word:words) set.add(word);
        String res = "";
        int reslen = 0;
        
        for(String str: set){
            boolean foundAll = true;
            for(int i=1; i<str.length(); i++){
                String substring = str.substring(0,i);
                
                if(!set.contains(substring)){
                    foundAll = false;
                    break;
                }
            }
            
            /*
                If we have successfully found all the substrings now we just need to do one thing
                1)if size of str is greater than res, then just replace the value of res with str
                2)Otherwise of str.length() == res.length(), then check if str is lexicographically
                smaller than res or not.
                
            */
            if(foundAll){
                if(str.length() > reslen){
                    reslen = str.length();
                    res = str;
                }
                else if(str.length() == reslen && str.compareTo(res) < 0){
                    reslen=str.length();
                    res=str;
                }
            }
        }
        
        return res;
    }
}