package javaP;

import java.util.Scanner;

public class evenORodd {
	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER NO: ");
		no =sc.nextInt();
		if(no%2==0) {
			System.out.print("no is even");
		}
		else {
			System.out.println("no is odd");
		}	
	}
	
}
