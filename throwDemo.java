package javaP;

import java.util.Scanner;

public class throwDemo {
	
	
	public static void demo()
	{
		int x;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter no: ");
			x=sc.nextInt();
			if(x>0) {
				
				System.out.println("square of "+x+ "is: "+(x*x));
			}	
				else 
				{
					throw new Exception();
				}	
		}
		catch(Exception e) {
			System.out.println("please enter positive value");
			demo();
		}
		}
	
       public static void main(String[] args) {
		demo();
	}
}
