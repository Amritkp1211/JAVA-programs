package javaP;

import java.util.Scanner;

/*• Create a class to print the area of a square and a rectangle. The class has two methods 
with the same name but different number of parameters. The method for printing 
area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side 
of square.
*/

public class AssignSqRectArea {
	float ar;
		float Area(float l, float b) {
			
			ar=l*b;
			System.out.println("ar of rectangle : "+ar);
			return ar;
			
		}
		float Area(float s) {
			ar= (s*s);
			System.out.println("ar of square : "+ar);
			return ar;
		}
		
		
	public static void main(String[] args) {
		 AssignSqRectArea a=new  AssignSqRectArea();
		 float l,b,s;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter side of square : ");
		 s=sc.nextFloat();
		 a.Area(s);
		 System.out.println("enter length of rc: ");
		 l=sc.nextFloat();
		 System.out.println("enter breadth of rc: ");
		 b=sc.nextFloat();
		 
		 a.Area(l,b);
		 
		 
		
	}

}
