package javaP;


import java.util.Scanner;

public class ASSign2leapyear {
	public static void main(String[] args) {
		
		
		try {
			int year ;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the year: ");
			year=sc.nextInt();
		if( year%4==0 || year%400==0){
			System.out.println("leap year");
			}
		else {
			System.out.println("not a leap year");
		}
		}
		catch(Exception e) {
			System.out.println("please enter positive value");
		}
	}

}
