package javaP;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadwrite {
	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("new2.txt");
		String s="welcome to tops";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("file written successfully");
		
		FileReader fr = new FileReader("new2.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
