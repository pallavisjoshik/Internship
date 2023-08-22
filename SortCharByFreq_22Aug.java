// leetcode451 sort character by frequency

class Solution {
    public String frequencySort(String s) {
        int count[]=new int[128];//store count of each char in given string(ASCII-128 size)
        char ch[]=new char[s.length()];//store output string in char array

        //traverse through array find frequency of each char in string
        for(char c:s.toCharArray()){
            count[c]++;
        }

        int i=0;//keep track of the current position while constructing the sorted string
         while(i<s.length()){
                int max=0; // keep track of the character with the highest frequency value
                int index=0;// keep track of the character index with the highest frequency

                // Find the character with the maximum frequency in the 'count' array
                for(int j=0;j<128;j++){
                    if(count[j]>max){
                        max=count[j];
                        index=j;
                    }
                }

                 // Place the character with maximum frequency in the output 'ch' array,    
                 //repeatedly for its frequency times
                while(count[index]>0){
                    ch[i]=(char)index;
                    count[index]--;
                    i++;
                }

        }
        // Convert the character array 'ch' to a String and return it as the output
        return new String(ch);
    }
}