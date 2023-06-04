import java.util.Scanner;
public class SwapTwoNum {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type value for num1");
        int num1 = sc.nextInt();
        System.out.println("type value for num2");
        int num2 = sc.nextInt();
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swapping, value of num1 is "+ num1 + " and num2 is "+num2);
       
    }
}
