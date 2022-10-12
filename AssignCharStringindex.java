package javaP;
/*• W.A.J.P to get the character at the given index within the String. Original String = 
Tops Technologies! The character at position 0 is T, The character at position 10 is o*/

public class AssignCharStringindex {
	public static void main(String[] args) {
		String s="Tops Technologies!";
		
		System.out.println("String is :"+s);
		
		int index1=s.charAt(0);
		int index2=s.charAt(10);
		
		System.out.println("at 0 : "+(char)index1);
		System.out.println("at 10 : "+(char)index2);
	}

}
