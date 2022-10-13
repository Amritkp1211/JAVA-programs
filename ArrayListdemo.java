package javaP;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(45);
		al.add(4.45);
		al.add("amrit");
		al.add('e');
		al.add(.00999);
		al.add(45);
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(45));
		System.out.println(al.get(3));
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf('e'));
		al.remove(3);
		al.set(5, 5343);
		System.out.println(al);
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
