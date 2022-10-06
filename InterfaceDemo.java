package javaP;

interface Itfs
{
	void meth();
}
interface Itfs2 extends Itfs
{
	void meth1();
}

public class InterfaceDemo implements Itfs2 {
	public static void main(String[] args) {
		
		InterfaceDemo n=new InterfaceDemo();
		n.meth();
		n.meth1();
	}
	 public void meth()
	{
		System.out.println("meth1");
		
	}
    public void meth1() 
    {
		System.out.println("meth2");
		
	}
	
	}


