class Addition 
{
	int sum = 0;
   	 int addTwoInt (int a, int b)
	{
		int sum = a+b;
		return sum;
	}	
}
public class MethodCall{
    public static void main(String[] args)
    {
        Addition obj = new Addition();
        int result = obj.addTwoInt(5,6);
        System.out.println("Sum of given numbers 5 and 6 is " + result);
    }
}
