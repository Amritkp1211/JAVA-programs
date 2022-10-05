package javaP;
class Box{
	double height,width,depth;
	
	Box(){
		System.out.println("default constructor called");
		height=10;
		width=2;
		depth=2;
		}
	Box(double h,double d,double w){
		System.out.println("parametrised constructor");
		height=h;
		width=w;
		depth=d;
		}
	Box(Box k){
		System.out.println("copy constructor");
		height=k.height;
		width=k.width;
		depth=k.depth;
		
	}
	void volume() {
		System.out.println("volume: "+(height*width*depth));
	}
	
	}

public class ConstructorDemo {
	public static void main(String[] args) {
		Box b=new Box();
		b.volume();
		Box b2=new Box(2,8,5);
		b2.volume();
		Box b3=new Box(b2);
		b3.volume();
		
		
	}
	

}
