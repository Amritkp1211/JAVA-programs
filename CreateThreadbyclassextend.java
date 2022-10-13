package javaP;
class NewThread extends Thread
{
	public NewThread() {
		super("child thread");
		}
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(this+" "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
   
}

public class CreateThreadbyclassextend {
  public static void main(String[] args) {
	  new NewThread();
	  Thread t=Thread.currentThread();
	  try {
			for(int i=0;i<5;i++) {
				System.out.println(t+" "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	  
	
}
}
