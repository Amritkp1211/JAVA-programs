package javaP;

/*~this is also known as constructor chaining 
~this only possible for default constructor
Overriding(runtime polymorphism) 
*/


class B1
{     void show() {
    System.out.println("B1's show method");
}
	B1(){
		System.out.println("this is default constructor B1 ");
	}
}
class B2 extends B1
{        void show() {
	super.show();
    System.out.println("B2's show method");
}
	B2(){
		System.out.println("this is default constructor B2");
		
			}
	
}
class B3 extends B2
{
	 void show() {
		 super.show();
		    System.out.println("B3's show method");
	      }
	
	B3(){
		System.out.println("this is default constructor B3");
	}
}
public class constructorINinheritance {
	
     public static void main(String[] args) {
    	 B3 obj=new B3();
    	 obj.show();
    	 
    	 
    	 
	
        }
}
