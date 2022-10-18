package javaP;

/*• Create a class with a method that prints "This is a parent class" and its subclass with 
another method that prints "This is child class". Now, create an object for each of 
the class and call 1 - method of parent class by object of parent class 2 - method of 
child class by object of child class 3 - method of parent class by object of child class 
*/
class P1
{
	void meth() {
		System.out.println("this is parent class");
		
	}
}
class p2 extends P1
{
	void meth1() {
		System.out.println("this is child class 1");
		
	}
}
class Sc1 extends p2 
{
	void meth2() {
		System.out.println("this is child class ");
		
	}
}

public class AssignClass extends Sc1{
	
	public static void main(String[] args) {
		P1 a=new P1();
		p2 b=new p2();
		Sc1 s=new Sc1();
		
		b.meth();
		s.meth2();
		s.meth1();
		b.meth();
		
		
	}

}


