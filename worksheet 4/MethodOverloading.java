package com.java.Polymorphism;
class Standard5{
    void student() {
        System.out.println("details of student is");
    }
    int student(int id) {
        return id;
    }
    String student(String name) {
        return name;
    }
    float student(float marks) {
        return marks;
    }
}
public class MethodOverloading {
    public static void main(String[]args) {
        Standard5 obj = new Standard5();
        obj.student();
        System.out.println("id is "+ obj.student(123456));
        System.out.println("name is " + obj.student("Pallavi")); 
        System.out.println("id is " + obj.student(90.2f));
    }

}
