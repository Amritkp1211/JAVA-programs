package javaP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp>
{

	
	public int compare(Emp e1, Emp e2) {
		int result=0;
		if(e1.getSal()>e2.getSal()) {
			result=1;
		}
		else if(e1.getSal()<e2.getSal()) {
			result= -1;
		}
		else if(e1.getSal()==e2.getSal()) {
			result=0;
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		ArrayList<Emp> list=new ArrayList<>();
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("amrit");
		e1.setSal(30000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("nitin");
		e2.setSal(40000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("yb");
		e3.setSal(80000);
		

		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("radhika");
		e4.setSal(60000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list, new ComparatorDemo());
		
		for(Emp e: list) {
			System.out.println("eid:  "+e.getEid()+"ename: "+e.getEname()+"salary: "+e.getSal());
		}
		
	}

}
