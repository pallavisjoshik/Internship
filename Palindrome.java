class Solution {
    public boolean isPalindrome(int x) {
      int temp = x; //initializing a temporary variable as input x
      int rev=0;   //initializing the reverse variable as zero
      while(x>0){ //creating reverse of given digit
        int digit = x%10; // 121%10 = 1 getting digits to create reverse number
        rev = (rev *10) + digit ; //this will give first digit of reverse order and so on 0+1 =1; 1*10+2=12;12*10+1=121
        x= x/10; //since we need to get next digit 121/10= 12 now this x=12 will be used to get next value of digit as 12%10=2
      }
      if (rev == temp) {  //since we stored the reversed number in rev and original number in temp 
        return true; //is palindrome
      }
      else
      return false;
    }
}
public class Palindrome{
    public static void main(String[]args){
        int num = 121;
        int num1 = -121;
        Solution obj = new Solution();
        System.out.println("121 is a ");
        System.out.println(obj.isPalindrome(num));
        System.out.println("-121 is a ");
        System.out.println(obj.isPalindrome(num1));
    }
}