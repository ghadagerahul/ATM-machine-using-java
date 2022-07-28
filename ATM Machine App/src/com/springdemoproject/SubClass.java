package com.springdemoproject;

import java.util.Scanner;

public class SubClass{
	
	String name = "";
	int UserName=0;
	String passward="";
	

	
	public SubClass(int id, String pass, String name) {
		// TODO Auto-generated constructor stub
		this.UserName= id;
		this.passward= pass;
		this.name = name;
		
	}

	
	
	void test() {		
		
		String orgionalpass = "Rahul1";
		
		if(UserName==21 && passward.equals(orgionalpass) ==true) {
			System.out.println("-------------   "+"Dear "+name+" WEL-Come TO YOUR ACCOUNT   -----------");
			System.out.println("Userid is : "+UserName);
			System.out.println("passward is the ******* ");
			System.out.println();
			System.out.println();
			
			System.out.println("Choose Your Action...");
			System.out.println("1. View Account Balance");
		    System.out.println("2. Add Money To Yur Wallet");
		    System.out.println("3. Deposit Money To Your Wallet");
			
		}
		else {
			System.out.println("user credientials is wrong");
		}
		
		System.out.println("=========================================================");
		
		Scanner sc =new Scanner(System.in);
		int option=sc.nextInt();

		
		
		switch (option) {
		case 1: {
			viewBalance();
			test();
		}
		break;
        case 2: {
        	System.out.println("Enter Amount To Deposite");
        	amt=sc.nextDouble();
			depositeBalance(amt);
			test();

		}
        break;
        case 3: {
        	System.out.println("Enter Amount To Widrow");
			amt=sc.nextDouble();
			widrowBalance(amt);
			test();

		}
        break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
		
		
					
		}

double balance;
double amt=0;

	private void widrowBalance(double amt) {
		// TODO Auto-generated method stub
		balance = balance-amt;
		
		System.out.println("Your Widrown Amount is : "+amt + " Rupees");
		System.out.println("Your Available Balance is : "+balance +" Rupees");
	}



	private void depositeBalance(double amt) {
		// TODO Auto-generated method stub
		balance = balance+amt;
		System.out.println("Your Deposited Amount is : "+amt);
		System.out.println("Your Available Balance is : "+balance);

	}



	private void viewBalance() {
		// TODO Auto-generated method stub
		balance = balance;
		System.out.println("Your Available Balance is : "+balance);

	}

	
	
}