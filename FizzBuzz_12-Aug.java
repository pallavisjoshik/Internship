import java.util.*;
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
//    creating list to do operation 
List<String> list = new ArrayList<String>();
    for(int i =1; i<=n; i++) //running for loop to check each integer value till the given n value
    {
    if(i%3==0 || i%5==0) 
        {
      list.add("FizzBuzz");  //if divided by 5 or 3 then adding fizzbuzz at that index in the list
         }
    else if (i%3==0){
    list.add("Fizz");
         }
    else if (i%5==0){
       list.add("Fizz");
         }
    else{
        list.add(Integer.toString(i)); //for remaining integer values at indices not divisible by 3AND 5, KEEPING INDICE VALUE AND CONVERTING IT TO STRING
    }
    }
    
    return list;
}
public static void main(String[]args){
    int n = 15;
    System.out.println(fizzBuzz(n));
}
}