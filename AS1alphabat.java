package javaP;

import java.util.Scanner;

/*• Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message.*/

public class AS1alphabat {
	public static void meth() {
		String a;
		try {
		Scanner sc= new Scanner(System.in);
			System.out.println("enter char :");
			a=sc.next();
			
			if(a.length()<=1) {
				if(a.charAt(0)=='a' ||a.charAt(0)=='e'||a.charAt(0)=='i'||a.charAt(0)=='o'||
						a.charAt(0)=='u'||a.charAt(0)=='A'||a.charAt(0)=='E'||a.charAt(0)=='O'||
						a.charAt(0)=='U'||a.charAt(0)=='I') {
					System.out.println("vowel");
				}
				else {
					System.out.println("consonant");
				}
			}
			else{
				throw new Exception();
			}
		}
			catch(Exception e) {
				System.out.println("please enter single char only");
				meth();
			}
	
		
	}
	
	public static void main(String[] args) {
		meth();
		
			}
}
