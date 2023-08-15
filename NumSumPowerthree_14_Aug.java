/* Online Java Compiler and Editor */
public class NumSumPowerThree {
    public static boolean checkPowersOfThree(int n) {
         //in the constraint it is given 1<n<10power7 , thus value of given number and power of 3 should be in this limit
         // that is 3power 14 will be highest value possible
         for(int i= 14; i>=0; i--){
            //initially taking highest possible power
            //though it starts from 3^14 - if n is smaller for any 3 power then result will be neagtive and not considered until 3power will be less than n and real working of code starts from there
            //here approach is same as we take binary number from decimal- 4=2(2)
            int temp = (int)Math.pow(3,i); //suppose 3^3 = 27
            if(n-temp>=0)
            {
                n=n-temp; //suppose n = 30 then now n = 30-27=3
                //and till i>0 ,the above loop wil run again
            }
            if(n==0){
                //now the above loop breaks
                //and it means number is sum of powers of three
                return true;
            }
            //if n==0 and i=0 then it means that it is not possible to represent n as sum of powers of three
        }
        return false;
    }
    public static void main(String[]args){
        int n = 30;
        System.out.println(checkPowersOfThree(n));
    }
}