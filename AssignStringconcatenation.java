package javaP;

import java.util.Scanner;

//• W.A.J.P to concatenate a given string to the end of another string.

public class AssignStringconcatenation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s;
		String s1;
		System.out.println("enter 1st string :");
		s=sc.nextLine();
		System.out.println("enter 2nd string :");
		s1=sc.nextLine();
		
		String result=s.concat(s1);
		System.out.println("final string is: "+result);
		
		
	}
}
