2.	package com.java.Abstraction;
3.	import java.util.Scanner;
4.	abstract class Lunch{
5.	     int price = 2999;
6.	     abstract void cuisine();
7.	     void price() {
8.	         System.out.println("the price is " + price);
9.	     }
10.	}
11.	class Menu extends Lunch{
12.	    void cuisine() {
13.	        Scanner sc = new Scanner(System.in);
14.	        System.out.println("type 1 for Indian and 2 for Chinese");
15.	        int choice = sc.nextInt();
16.	        if (choice == 1) {
17.	            System.out.println("you will get indian thali");
18.	        }
19.	        else if (choice == 2) {
20.	            System.out.println("you will get noodles");
21.	        }
22.	        else {
23.	            System.out.println("invalid choice");
24.	        }
25.	        System.out.println(super.price);
26.	    }
27.	}
28.	public class AbstractClasses {
29.	public static void main(String[] args) {
30.	    Menu obj = new Menu();
31.	    obj.cuisine();
32.	    obj.price();
33.	    
34.	}
35.	}
