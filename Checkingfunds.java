package javaP;

public class Checkingfunds {
	int ano;
	double balance;
	
	public Checkingfunds(int ano,double balance) {
		this.ano=ano;
		this.balance=balance;
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) throws InsufficientFund
	{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}
		else {
			double needs=amount-this.balance;
			throw new InsufficientFund(needs);
			}
		}
	public void checkbalance() {
       System.out.println("balance: "+this.balance);		
	}
	
}
