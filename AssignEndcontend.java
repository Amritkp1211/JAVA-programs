package javaP;

/*• W.A.J.P to check whether a given string ends with the contents of another string. 
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
*/
public class AssignEndcontend {
	public static void main(String[] args) {
		String s1="Java Exercises";
		String s2="Java Exercise";
		String end="se";
		
		System.out.println("end words matching  :: "+s1+ " : "+end+" =>"+s1.endsWith(end));
		System.out.println("end words matching  :: "+s2+" : "+end+"  =>"+s2.endsWith(end));
		
	}

}
