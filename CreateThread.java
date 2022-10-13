package javaP;
//thread by implementing runnable interface
class Newthread implements Runnable
{
  Thread t;
  String tname;
   public Newthread(String tname) {
	   this.tname=tname;
	t=new Thread(this,"child thread");
	t.start();
}
  
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("child thread existing");
		}
	
	
}

public class CreateThread {
	public static void main(String[] args) {
		new Newthread("one");//constructor call
		new Newthread("two");
		new Newthread("three");
		Thread t=Thread.currentThread();
		try {
			for(int i=0;i<5;i++) {
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		System.out.println("main thread existing");
	
	}
}
