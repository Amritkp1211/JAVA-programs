package javaP;


public class Methodoverloding {
	
	void method(int a) {
		System.out.println("method with 1 parameter");
	}
	void method(int a,int b) {
		System.out.println("method with two parameter");
	}
	void method() {
		System.out.println("method with no parameter");
	}
	public static void main(String[] args) {
		Methodoverloding s=new Methodoverloding();
		s.method();
		s.method(3);
		s.method(3, 4);
		s.method(3,40);
	}

}
