package javaP;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
	
	int  button;
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the no : ");
	button=sc.nextInt();
	
	switch(button) {
	case 1: 
		System.out.print("good");
	case 2:
		System.out.print("bad");
		default: 
			System.out.println("fail");
	
	
	}
	
	}

}
