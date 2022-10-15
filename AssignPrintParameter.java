package javaP;
/*• Create a class to print an integer and a character with two methods having the same 
name but different sequence of the integer and the character parameters. For 
example, if the parameters of the first method are of the form (int n, char c), then 
that of the second method will be of the form (char c, int n).*/

public class AssignPrintParameter {
	void print(int n,char c) {
		
		System.out.println("int= "+n);
		System.out.println("char= "+c);
		
	}
	void print(char c,int n) {
		
		System.out.println("-----------------------------------------------------");
		System.out.println("char= "+c);
		System.out.println("int= "+n);
		}
	public static void main(String[] args) {
		AssignPrintParameter a=new AssignPrintParameter();
		
		a.print(10, 'k');	
		a.print('k', 100);
	}

}
