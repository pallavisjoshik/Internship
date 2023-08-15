public class Solution {
    public static String numberToWords(int a) {
        String word = " ";
        String unitArray[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String tensarray[]={"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if(a==0){
            return "zero";
        }
        if(a<0){ //for negative values
            String number = " "+a;
            number = number.substring(1); //to remove negative sign
            return "minus" + numberToWords(Integer.parseInt(number)); //using recurrsion
        }
        //for positive non zero integers
        // for number divisible by one million
        if((a/1000000)>0)
        { 
            word = word + numberToWords(a/1000000) + " Million";
            //now we need to shorten the a by one digit
            a = a%1000000;
        }
        //similar to one million , other blocks for onethousand, onehundered
        if((a/1000)>0)
        { 
            word = word + numberToWords(a/1000) + " Thousand";
            //now we need to shorten the a by one digit
            a = a%1000;
        }
        if((a/100)>0)
        { 
            word = word + numberToWords(a/100) + "Hundred";
            //now we need to shorten the a by one digit
            a = a%100;
        }
        if(a>0){
            if(a<20){
                word = word + unitArray[a];
            }
            else{
                word = word + tensarray[a/10];
                if(a%10>0){
                    word = word + "-" + unitArray[a%10];
                }
            }
        }
        return word;
    }
    public static void main(String[]args){
        int number = 1234;
        System.out.println(numberToWords(number));
    }
} 