package javaP;

/*
 * • Create a class with a method that prints "This is a parent class" and its subclass with 
another method that prints "This is child class". Now, create an object for each of 
the class and call 1 - method of parent class by object of parent class 2 - method of 
child class by object of child class 3 - method of parent class by object of child class
*/
class A1
{
	public void meth1()
	{
		System.out.println("this is parent class");
	}
}

class A2 extends A1
{
	public void meth2()
	{
	System.out.println("this is child class of A1");	
	}
}

public class AssignClassPrint extends A2 
{
	public void meth3() {
		System.out.println("this is child class of A2 and subclass of A1");
	}
	public static void main(String[] args) {
		
		A1 obj1=new A1();
		A2 obj2=new A2();
        AssignClassPrint obj3=new AssignClassPrint();
        obj1.meth1();
        obj3.meth2();
        obj3.meth1();
        obj2.meth1();
		
	}

}
