package javaP;

import java.util.Scanner;
/*Write a Java program that accepts an integer (n) and computes the value of 
n+nn+nnn. Input number: 5 
5 + 55 + 555*/

public class AssignComputeno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter no:");
		a=sc.nextInt();
		System.out.print(""+a);
		System.out.print(" "+a+a);
		System.out.println(" "+a+a+a);
		int k= a +(a*a)+ (a*a*a);
         
		System.out.println("sum: "+k);
	
}

}
