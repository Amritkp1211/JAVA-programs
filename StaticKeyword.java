package javaP;

//static variable

import java.util.Scanner;

public class StaticKeyword {
	static int a;
	Scanner sc= new Scanner(System.in);
	 
	void setvalue() {
		System.out.println("enter A: ");
		a=sc.nextInt();
		
	}
	void getvalue() {
		System.out.println(" A: "+a);
	}
	
	public static void main(String[] args) {
		StaticKeyword s1=new StaticKeyword();
		StaticKeyword s2=new StaticKeyword();
		StaticKeyword s3=new StaticKeyword();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.getvalue();
		s2.getvalue();
		s3.getvalue();
		
	}

}
