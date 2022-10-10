package javaP;

import java.util.Scanner;
/*• Write a Java program that reads a positive integer and count the number of digits the 
number. 
Input an integer number less than ten billion: 125463 
Number of digits in the number: 6 */

public class Assigndigitcount {
	public static void main(String[] args) {
		
		long a;
		int digit=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no: ");
		a=sc.nextLong();
		while (a != 0) {
			a /= 10;
		digit++;
		}
		System.out.println(" "+digit);
		
		}

}
