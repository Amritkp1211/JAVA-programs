package javaP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileinputOutputDemo {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos= new FileOutputStream("new.txt");
		String s="welcome to ajitians club";
		
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		
		System.out.println("file written successfully");
		
		FileInputStream fis=new FileInputStream("new.txt");
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
		
	}

}
