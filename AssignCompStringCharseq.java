package javaP;
//W.A.J.P to compare a given string to the specified character sequence. Comparing 
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
public class AssignCompStringCharseq {
     public static void main(String[] args) {
		String s1="topsint.com:";
		String s2="Topsint.com";
		CharSequence s="topsint.com:";
		
		System.out.println("comparing :"+s1+" : "+s+" =>"+s1.contentEquals(s));
		System.out.println("comparing :"+s2+" : "+s+" =>"+s2.contentEquals(s));

	}
}
