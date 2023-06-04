import java.util.Scanner;
public class PrimeOrNot 
{
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("type a number of your choice");
        int num = sc.nextInt();
        boolean result= false;
        if ((num == 0)||(num==1)) 
            {
                System.out.println(num + " is not a  prime number");
            }
        int f= 0;
        for (int i = 2; i<= num; i++) 
            {
                if (num % i == 0) 
                {
                    f++;
                }
            }
        if (f>1) 
            {
                System.out.println(num + " is not a  prime number");
            }
        else 
            {
                System.out.println(num + " is  a prime number");
            }
    }

}

