package javaP;

import java.util.Scanner;

class A{
	int a;
	void putA(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter A: ");
		a=sc.nextInt();
	}
	void getA() {
		System.out.println(" A: "+a);
		
	}
}
class B extends A
{
	int b;
	void putB(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter B: ");
		b=sc.nextInt();
	}
	void getB() {
		System.out.print(" B: "+b);
		
	}
	
}

public class InhertanceDemo {
	public static void main(String[] args) {
		B obj=new B();
		obj.putA();
		obj.getA();
		obj.putB();
		obj.getB();
		
	} 
	

}
