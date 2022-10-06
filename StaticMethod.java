package javaP;

public class StaticMethod {
	static int a=10;
	static int b;
	
	static void meth(int x) {
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("x: "+x);
		
	}
	static {
		System.out.println("static block intialized");
		b=4*a;
	}
	public static void main(String[] args) {
		{ /*
			 * StaticMethod s=new StaticMethod(); 
			 * s.meth(5);
			 * OR
			 */
			meth(5);
		}
	}

}
