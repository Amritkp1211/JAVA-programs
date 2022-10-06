package javaP;

import java.util.Scanner;

public class fullstring {
	public static void main(String[] args) {
		{
			Scanner s=new Scanner(System.in);
			String name;
			System.out.println("enter string: ");
			name=s.nextLine();
			name+=s.nextLine();
			s.close();
			System.out.println(" string :"+name);
			
		}
	}

}
