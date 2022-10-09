package javaP;

import java.util.Scanner;

/*• Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop.*/
public class AssignSumAvg {
	public static void main(String[] args) {
		try {
		double sum=0;
		int i;
		double[] arr=new double[5];
		System.out.println("enter 5 elements ");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
			sum+=arr[i];
			}
		System.out.println("sum: "+sum);
		
		double avg=sum/5;
		System.out.println("avg: "+avg);
			
		}
		catch(Exception e) {
			System.out.println("please insert correct value");
		}
	}

}
