import java.util.Scanner;
public class reverse{
    public static void main(String[]args){
        int n, temp;     //declaring n for taking input integer and temp for storing single digits of integer temporarily
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any integer");
        n = sc.nextInt();
        System.out.println("Reverse of given integer is ");
        while(n>0){  //to run the loop till value of given integer is greater than zero
            temp = n%10;  //this would give last digit of integer
            System.out.print(temp); //printing the acquired digit
            n = n/10;  //after getting last digit we need to cut that from orginal integer thus dividing by 10 will decrease the length of integer by 1
    
        }
    }
}