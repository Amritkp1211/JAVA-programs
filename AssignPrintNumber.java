package javaP;

/*• Create a class named 'Print Number' to print various numbers of different data types 
by creating different methods with the same name 'printn' having a parameter for 
each data type*/

public class AssignPrintNumber {
	
	void printn(int i) {
		System.out.println("int  :"+i);
	}
	void printn(double d) {
		System.out.println("double :"+d);
	}
	
	void printn(char c) {
		System.out.println("char : "+c);
	}
	void printn(String S) {
		System.out.println("String :"+S);
	}
	
	public static void main(String[] args) {
		AssignPrintNumber a=new AssignPrintNumber();
		a.printn(5);
		a.printn(50.00565675473675637);
		a.printn("amrit");
	    a.printn('a'); 
	}

}
