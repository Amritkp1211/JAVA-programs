package javaP;

class Vol{
	int x,y,z;
	Vol(){
		System.out.println("default constructor");
		x=5;
		y=6;
		z=9;
		
	}
	Vol(int p,int q,int r){
		System.out.println("parametrised constructor");
		x=p;
		y=q;
		z=r;
	}
	Vol(Vol k){
		System.out.println("copy constructor");
		x=k.x;
		y=k.y;
		z=k.z;
	}
	void volume(){
		System.out.println("volume : "+(x*y*z));
		
	}
}


public class Practiceconstructor {
	public static void main(String[] args) {
		
		Vol j=new Vol();
		j.volume();
		Vol l= new Vol(5,34,6);
		l.volume();
		Vol d =new Vol(l);
		d.volume();
	}

}
