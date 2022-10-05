package javaP;

import java.util.Scanner;

public class Nnosum {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the no: ");
		n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.print("sum  : "+sum);
	}

}
