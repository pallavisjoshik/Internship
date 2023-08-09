import java.util.*;
public class CalculatorStack {
    public static  int calculate(String s) {
        
        int sum = 0;
        int sign = 1; //initializing required variables
        // creating stack to store the given equation
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        // surfing through the stack to see each entry if digit or char
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            // if the element is digit then
            if(Character.isDigit(ch)){
                int value = 0; //declaring initial value as zero
                // till no space or character found in expression, all elements will be considered one number
                while (i<s.length()&& Character.isDigit(s.charAt(i))){
                    value = value*10 + (s.charAt(i)-'0'); //taking entire number 
                    i++;
                }
                // since i is now shifted one step it will skip the symbol thus to bring it back at operator/symbol
                i--;
                value = value*sign;
                sign = 1; //resetting sign value
                sum += value;
            }//if the element is character then
            else if(ch=='(') {  //after opening bracket we need to do operation inside elements thus pushing them
                st.push(sum);
                st.push(sign);
                sum = 0;
                sign = +1;
            }
            else if(ch==')') { // after closing bracket we need to do operation between inside result and outside value
                sum *= st.pop();
                sum += st.pop();
            }
            else if(ch=='-') { //for minus sign the sum will become negative
                sum *= -1;
            }
        }
        return sum; //returning final sum value
    }
    public static void main(String[]args) throws Exception{ //for handling exception
        String str = "23+5+(5*5)-3";
        int result = calculate(str);
        System.out.println(result);
    }
}