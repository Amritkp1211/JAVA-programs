package javaP;

public class pattern2 {
	public static void main(String[] args) {
		
		for(int i=10;i>=0;i--) {
			for(int k=0;k<=9-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=1;i<=10;i++) {
			for(int k=0;k<=9-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	
	}
}
