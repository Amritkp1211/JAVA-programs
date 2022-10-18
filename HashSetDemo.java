package javaP;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
       public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add("amrit");
		hs.add(true);
		hs.add(null);
		hs.add('a');
		hs.add(213);
		hs.add(10);
		System.out.println(hs);
		System.out.println(hs.contains("amrit"));
		System.out.println(hs.isEmpty());
		
		
		Iterator itr= hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
