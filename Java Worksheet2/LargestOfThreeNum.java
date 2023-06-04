import java.util.Scanner;
public class LargestOfThreeNum
{
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("type value for num1");
        int num1 = sc.nextInt();
        System.out.println("type value for num2");
        int num2 = sc.nextInt();
        System.out.println("type value for num3");
        int num3 = sc.nextInt();
        if((num1>num2)&&(num1>num3))
        {
            System.out.println(num1 +" is the largest among given numbers");  
        }
        else if((num2>num3)&&(num2>num3))
        {
            System.out.println(num2 +" is the largest among given numbers");  
        }
        else{
            System.out.println(num3 +" is the largest among given numbers");  
        }

    }

}