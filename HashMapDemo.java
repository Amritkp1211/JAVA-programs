package javaP;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(1, "radhika");
		hm.put("sd", "qsad");
		hm.put("sa", "hv");
		hm.put(2, "nitin");
		hm.put(3,"yashpal");
		hm.put(4, "brijraj");
		hm.put(5,"amrit");
		System.out.println(hm);
		System.out.println(hm.containsValue("nitin"));
		System.out.println(hm.get(3));
		hm.replace(3,"yuvraj");
		System.out.println(hm);
		
		
}
}