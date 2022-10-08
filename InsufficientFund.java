package javaP;

public class InsufficientFund extends Exception 
{
	public double amount;
	public InsufficientFund(double amount){
		this.amount=amount;
	}
	public double getamount() {
		return this.amount;
	}
	
}
