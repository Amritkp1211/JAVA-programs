package javaP;

import java.util.Scanner;

public class Array {
	
		public static void main(String[] args) {
			int temp,i,j;
			int a[]=new int[5];
			Scanner sc= new Scanner(System.in);
			System.out.println("enter array elements: ");
			
			for( i=0;i<a.length;i++) {
				System.out.print("enter "+(i+1)+" element : ");
				a[i]=sc.nextInt();
			}
			System.out.println("array elements are: ");
			for( i=0;i<a.length;i++) {
				System.out.println("A["+i+"] ="+a[i]);
			}
			
			for(i=0;i<a.length;i++) {
				for( j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;}
					}
				}
				
				System.out.println("ascending order: ");
				
				for(i=0;i<a.length;i++) {
					System.out.println("A["+i+"] ="+a[i]);
				}

				for(i=0;i<a.length;i++) {
					for( j=i+1;j<a.length;j++) {
						if(a[i]<a[j]) {
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;}
						}
					}
					
					System.out.println("decending order: ");
					
					for(i=0;i<a.length;i++) {
						System.out.println("A["+i+"] ="+a[i]);
					}
				
			
		}
	}
	


