package javaP;

public class GenericDemo {
	public static <E> void printArray(E[] inputarray) {
		for(E e:inputarray) {
			System.out.print(e+" ");
		}
		System.out.println();
			
		
	}
	public static void main(String[] args) {
		Integer intarray[]= {2,45,65,34,54};
		Character chararray[]= {'a','f','g','s','d'};
		Double doubelarray[]= {1.1,2.2,3.4,4.4,5.5};
		String stringarray[]= {"amrit","yb","nitin","ashok","yuvraj"};
		
		printArray(intarray);
		printArray(chararray);
		printArray(doubelarray);
		printArray(stringarray);
		
		
	} 

}
