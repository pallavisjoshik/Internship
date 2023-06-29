package com.java.Polymorphism;
 class School{
     int students(int num){
         System.out.println("total number of students in base class are");
         return num;
     }
 }
 class Standard7 extends School{
     int students(int num){
         System.out.println("total number of students in derived class are");
         return num;
     }
 }
     
public class MethodOverriding {
public static void main(String[]args) {
    Standard7 obj = new Standard7();
    System.out.println(obj.students(56));
}
}
