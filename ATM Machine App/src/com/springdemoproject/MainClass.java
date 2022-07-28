package com.springdemoproject;

import java.util.Scanner;

interface MainClass {

 
public static void main(String[] args) {
	Scanner rg =new Scanner(System.in);
	
	System.out.println("Enter Your name");
	String name = rg.nextLine();
	
	System.out.println("Enter the userId");
	int id=rg.nextInt();
	
	System.out.println(" enter the passward"+"  (passward length shoud be 7 characters)");
	String pass= rg.next();
	
SubClass obj = new SubClass(id, pass,name);
obj.test();
}
	
}
