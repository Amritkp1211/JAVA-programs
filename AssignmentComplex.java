package javaP;

/*• Print the sum, difference and product of two complex numbers by creating a class 
named 'Complex' with separate methods for each operation whose real and 
imaginary parts are entered by user.*/
import java.util.*;
class complex
{
	int real;
	int imag;
 
	 public complex(int r,int i)
	 {
		 r=real;
		 i=imag;
	 }
	 public static complex add(complex a,complex b)
	 {
		 return new complex((a.real+b.real),(a.imag+b.imag));
	 }
	 
	 public static complex diff(complex a,complex b)
	 {
		 return new complex((a.real-b.real),(a.imag-b.imag));
	 }
	 
	 public static complex product(complex a,complex b)
	 {
		 return new complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
	 }
	 
	 public void printComple()
	 {
		 if(real==0 && imag!=0)
		 {
			 System.out.println(imag+"i");
		 }
		 else if(real!=0 && imag==0)
		 {
			 System.out.println(real);
		 }
		 else {
			 System.out.println(real+"+"+imag+"i");
		 }
	 }
	
}

public class AssignmentComplex {
	public static void main(String[] args) {
		complex c=new complex(6,7);
		complex d=new complex(3,9);
		
		complex e=complex.add(c, d);
		complex g=complex.diff(c, d);
		complex k=complex.product(c, d);
		
		e.printComple();
		g.printComple();
		k.printComple();

	}

}
