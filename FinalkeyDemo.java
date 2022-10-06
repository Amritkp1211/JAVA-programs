package javaP;
class final1
{
	final int a;
	
	public final1(){
		a=10;
	}
	void meth() {
		System.out.println("a: " +a);
		
	}
	
}
class final2 extends final1
{
	void show() {
		System.out.println("this is show method");
	}
}
public class FinalkeyDemo {
	public static void main(String[] args) {
		final2 n=new final2();
		n.meth();
		n.show();
	}

}
