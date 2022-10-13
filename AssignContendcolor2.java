package javaP;

/*W.A.J.P to check whether a given string starts with the contents of another string. 
Red is favorite color. Starts with Red? True Orange is also my favorite color . Starts
with Red? False I3.*/ 

public class AssignContendcolor2 {
	public static void main(String[] args) {
		
		String s="Red is favorite color";
		String s2="Orange is also my favorite color";
		String str="Red";
		
		System.out.println("start word match :- "+s+" : "+str+" => "+s.startsWith(str));
		System.out.print("start word match :- "+s2+" : "+str+" => "+s2.startsWith(str));

		
	}

}
