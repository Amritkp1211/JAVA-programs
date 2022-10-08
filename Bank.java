package javaP;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args)  {
		double amount;
		int c;
		Checkingfunds s= new Checkingfunds(1,10000);
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("1.deposit");
			System.out.println("2. withdraw");
			System.out.println("3. check balance");
			System.out.println("4. exit");
			System.out.println("enter your choice: ");
			c=sc.nextInt();
			if(c==1) {
				System.out.print("enter amount to deposit");
				amount=sc.nextDouble();
				s.deposit(amount);
				}
			else if(c==2) {
				try {
				System.out.print("enter amount to withdraw");
				amount=sc.nextDouble();
				s.withdraw(amount);
				}
				catch(InsufficientFund e) {
					System.out.println("sorry you need another "+e.getamount()+"rs");
				}
				}
			else if(c==3) {
				s.checkbalance();
			}
			else {
				break;
			}
		}
		
		
		
	}
}

