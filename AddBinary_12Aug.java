import java.util.*;
public class AddBinary {
    public static String addBinary(String a, String b) {
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();  //converting the given string into char arrray

        //now creating string to store the answer
        StringBuilder sb = new StringBuilder();
        // since addition is done from last digit, we will fix indexes of both char array at last entry
        int ia = ca.length -1;
        int ib = cb.length -1;
        // setting the reference value for each digit addition
        int r = 0;
        // now we will run the loop till these indices are greater than zero and compare the respective indices value and return appropriate binary sum answers
        while(ia>=0 || ib>=0){
            // if both the strings char array are of equal length then both ia and ib will be >0 simultaneously
        if(ia>=0 && ib>=0){
            if(ca[ia]=='0'&& cb[ib]=='0') {// checking for both 0 condition then it should return 0
                if(r==1){
                    sb.append('1');
                    r=0;
                }else{
                    sb.append('0');
                }
            }
            else if(ca[ia]=='0' && cb[ib]=='1') {   // checking for both 0 condition then it should return 0
                if(r==1){
                    sb.append('0');
                }else{
                    sb.append('1');
                }
            }
            // checking for both 0 condition then it should return 0
            else if(ca[ia]=='1' && cb[ib]=='0') {
                if(r==1){
                    sb.append('0');
                }else{
                    sb.append('1');
                }
            }
            else if(ca[ia]=='1'&& cb[ib]=='1') {// checking for both 0 condition then it should return 0
                if(r==1){
                    sb.append('1');
                }else{
                    sb.append('0');
                    r=1;
                }
            }
         }
        // if ca char array is larger in length than cb  
        else if(ia>=0){
            if(ca[ia]=='0') {  // if  ca[ib] is empty then result will be zero irrespective of ca[ia] value
                if(r==1){
                    sb.append('1');
                    r=0;
                }else{
                    sb.append('0');
                }
            }
            else if(ca[ia]=='1') {  // if  ca[ib] is empty then result will be zero irrespective of ca[ia] value
                if(r==1){
                    sb.append('0');
                }else{
                    sb.append('1');
                }
            }
        }
        // if cb char array is larger in length than ca 
        else if(ib>=0){
            if(cb[ib]=='0') {  // if  ca[ia] is empty then result will be zero irrespective of ca[ib value
                if(r==1){
                    sb.append('1');
                    r=0;
                }else{
                    sb.append('0');
                }
            }
            else if(cb[ib]=='1') {  // if  ca[ia] is empty then result will be zero irrespective of ca[ib] value
                if(r==1){
                    sb.append('0');
                }else{
                    sb.append('1');
                }
            }
        }
        ia--;
        ib--;  //decreasing the indices one by one to continue addition
    }
        if(r==1){  //for any carry over
            sb.append('1'); 
        } 
        return sb.reverse().toString();  //since addition was done from behind we need to reverse the string to get correct answer
    }
public static void main(String[]args){
    String a = "101";
    String b = "111";
    System.out.println(addBinary(a,b));
}
}