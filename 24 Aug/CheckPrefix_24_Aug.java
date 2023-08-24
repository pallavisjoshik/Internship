// leetcode - 1455 - check if word occurs as prefix to any word in sentence 

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[] = sentence.split(" ");  //spliting the string where space is used and storing the each splited word as element in array
        for(int i=0; i<arr.length; i++){
            String word = arr[i];  // taking each element of array as word one by one 
            if(word.startsWith(searchWord)){  //if the word starts with search word
                return i+1;  //then returning the index of word plus 1 to show position of word(since index starts from 0 and position from 1)
            }
        }
        return -1; //if the word is not found then return -1
    }
}