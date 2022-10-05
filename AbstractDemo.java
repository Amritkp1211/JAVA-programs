package javaP;

abstract class abs1
{
	void method1() {
		System.out.println("method 1");
	}
	abstract void method2();
}

class abs2 extends abs1
{

	void method2() {
		
		System.out.println("method 2");
	}
	
	
}
public class AbstractDemo {
	public static void main(String[] args) {
		abs2 k=new abs2();
		k.method1();
		k.method2();

	}

}
