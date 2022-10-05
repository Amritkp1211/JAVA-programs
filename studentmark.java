package javaP;

import java.util.Scanner;

public class studentmark {
	public static void main(String[] args) {
		
		int s1,s2,s3,sum=0,rno;
		String name;
		double per;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter roll no: ");
		rno=sc.nextInt();
		System.out.println("enter name: ");
		name =sc.next();
		System.out.println("enter the s1 marks: ");
		s1=sc.nextInt();
		System.out.println("enter the s2 marks: ");
		s2=sc.nextInt();
		System.out.println("enter the s3 marks: ");
		s3=sc.nextInt();
		
		sum=s1+s2+s3;
		System.out.println("total: "+sum);
		per=sum/3;
		System.out.println("percentage: "+per);
		if(per>=70) {
			System.out.println("distinction");
			}
		else if(per<=50) {
			System.out.println("good");
		}
		else if(per<=40) {
			System.out.println("bad");
			}
		else {
			System.out.println("fail");
		}
		
}

}
