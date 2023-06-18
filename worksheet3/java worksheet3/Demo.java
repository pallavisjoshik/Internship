class Example
{
    String name;
	int number;
    public String getName(){
        return name;
    }
    public void setName(String n){
       this.name = n;
    }
    public void setNumber(int i){
        this.number = i;
    }
    public int getNumber(){
        return number;
    }
}
public class Demo{
    public static void main(String[] args)
    {
        Example obj = new Example();
        obj.setName("Pallavi");
        System.out.println(obj.getName());
        obj.setNumber(123);
        System.out.println(obj.getNumber());

    }
}