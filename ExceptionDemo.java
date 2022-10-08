package javaP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("code start");
		int a,b,c;
		try 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A: ");
		a=sc.nextInt();
		System.out.println("enter B: ");
		b=sc.nextInt();
		
		c=a/b;
		System.out.println("division : "+c);
		int arr[]= {1,2,3};
		System.out.println(arr[6]);
		
		}
		/*catch(ArithmeticException e) {
			System.out.println("expection caught");
		}
		catch(InputMismatchException e) {
			System.out.println("expection caught");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("expection caught");
		}*/
		catch(Exception e){
			System.out.println("exception caught");
			}
		System.out.println("code end");
		
	}

}
