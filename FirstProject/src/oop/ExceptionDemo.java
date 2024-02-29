package oop;
import java.io.*;
import java.util.*;
class Account{
	int balance;
	Account(int a){
		balance=a;
	}
	void enquery(int w) {
		try {
		if(balance<w)
			throw new BalanceException(balance-w);
		}
		catch(BalanceException e) {
			System.out.println("Error catch exception");
		}
		if(balance>w)
			System.out.println("withdraw is down");
	}
}
class ExceptionDemo {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		try {
		c=a/b;
		System.out.println("try block");
		}
		catch(ArithmeticException |NullPointerException e) {
			System.out.println("Exception occured");
		}
		
		finally {
			System.out.println("pending statement line");
		}  
		
	
	File file=new File("abcd.txt");
	try {
		FileInputStream fs=new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(c);
	System.out.println("End of the program");
//	int i;
//	try(Scanner scanner=new Scanner(System.in))
//	{
//		i=scanner.nextInt();
//	}
////	scanner.close();
//	System.out.println(i);
	
	double bal=500,withdraw=700;
	try {
	if(bal<withdraw)
		throw new InsufficientfoundException(withdraw-bal);
	}
	catch(InsufficientfoundException e) {
		System.out.println("Not enought money");
		
		Account acc=new Account(1000);
		acc.enquery(120);
	}
	}
}
