package com.java.Interface;
interface Calculator{
//  in interface only abstract, static , default and private methods can be defined
    abstract public void message();
//  even if abstract keyword is not used , we can declare above method
    static int sum(int num1, int num2) {
        return num1+num2;
    }
//  multiple static, abstract, default and private methods can be used in a interface
    static int sub(int num1, int num2) {
        return num1-num2;
    }
    default void mul(int num1, int num2){
    System.out.println("multiplication is" + num1 * num2); 
    System.out.println("division is " + div(num1,num2));
    }
//  private methods need to called in the same class and can be called in default method, cannot be called in static method
    private int div(int num1, int num2) {
        return num1/num2;
    }
}
interface Successful{
    public void note();
}
class Result implements Calculator, Successful{
    public void message() {
        System.out.println("the result as per calculation is");
    }
    public void note() {
        System.out.println("the calculation is done successfully");
    }
}
// example of multiple inheritance
public class Interfaces{
public static void main(String[] args) {
    Calculator obj = new Result();
    Successful obj1 = new Result();
    obj.message();
    System.out.println("sum is "+ Calculator.sum(56,44));
    System.out.println("substraction  is "+ Calculator.sub(8,2));
    obj.mul(25, 5);
    obj1.note();
}
}
