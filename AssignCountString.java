package javaP;

import java.util.Scanner;

/*• Write a Java program to count the letters, spaces, numbers and other characters of 
an input string */
public class AssignCountString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=sc.nextLine();
		int letter=0,space=0,digit=0,other=0;
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(c[i])) {
				letter++;
			}
			else if(Character.isSpaceChar(c[i])) {
				space++;
			}
			else if(Character.isDigit(c[i])) {
				digit++;
				
			}
			else {
				other++;
			}
		}
		System.out.println("letter: "+letter);
		System.out.println("digit: "+digit);
		System.out.println("space: "+space);
		System.out.println("others: "+other);
		
	
   }
}
