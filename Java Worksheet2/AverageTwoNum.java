import java.util.Scanner;
public class AverageTwoNum {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type first number");
        int num1 = sc.nextInt();
        System.out.println("type second number");
        int num2 = sc.nextInt();
        System.out.println("Average of given numbers is: " + ((num1+num2)/2));
       
    }
}
