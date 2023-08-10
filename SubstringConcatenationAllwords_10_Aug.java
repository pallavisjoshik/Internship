import java.util.*;
public class Solution {
    public static  List<Integer> findSubstring(String str, String[] words) {
        //if no substring is present
        if(str == null || str.length() == 0 || words == null || words.length ==0){
        return new ArrayList<>();  
        }
    // we will use map to find frequency of every word
    Map<String, Integer> frequencyMap = new HashMap<>();

    for(String word: words){
       // calculating frequency and put it in frequency map
        frequencyMap.put(word, frequencyMap.getOrDefault(word, 0)+1);
    }
    //all words are of same length thus calculating length of any one word
    int eachWordLength = words[0].length();
    //calculating total words length
    int totalWords = words.length;
    List<Integer> result = new ArrayList<>(); //creating variable result to store answer in form of array of indices
     
    for(int i =0; i<=str.length()-totalWords*eachWordLength; i++){
        //limit of forloop is set such because it would be waste of time to check string beyond maximumlength (suppose 6) possible of concatenated string from behind i.e. last 6 characters shouldnot be checked
        Map<String, Integer> seenWords = new HashMap<>(); //useful for cases where substrings are repeating
        for(int j =0;j<totalWords; j++){
            int wordIndex = i+j*eachWordLength; //if first word found at 0 index then next word should be checked at eachwordlength(suppose 3)index
            // now finding the word - it will be of eachwordlength from wordindex
            String word = str.substring(wordIndex, wordIndex + eachWordLength);
            //checking if the word exists in frequency map, if not then we need to increase the frequency of this word
            if(!frequencyMap.containsKey(word)){
                break;
            }
            seenWords.put(word, seenWords.getOrDefault(word,0)+1); //increasing frequency of wors
        // but if seenwords fequency is more than actual frequency then it needs notbe increased (eg. {cap, map}- capcapmap - here first cap should not be added to seen frequency)
            if(seenWords.get(word)> frequencyMap.getOrDefault(word,0)){
                break;
            }
            if (j+1 == totalWords){ //if the j+1 that is identifies words matches total words count then we can add index i as instance of occurance of concatenated string
                result.add(i);
            }
        }
    }
    return result; //output as array of indices of occurance of concatentted string
    }
    public static void main(String[]args){
        String str = "cmapcapmapdaplapmapcapmap";
        String[] words = {"map", "cap","map"};
        System.out.println(findSubstring(str, words));
    }
}