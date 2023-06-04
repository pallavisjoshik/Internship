import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number to generate its Multiplication Table");
        int num = sc.nextInt();
        System.out.println("Multiplication table of "+num+ " is as follows:");
        for(int i = 1; i<=10; i++)
        {
            System.out.println(num + " * "+i + " = "+ (num*i));
        }
       
    }

}

