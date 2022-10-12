package javaP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int rno;
	String name;
	double per;
	public Student(int rno, String name, double per) {
		
		this.rno = rno;
		this.name = name;
		this.per = per;
	}
	public String toString() {
		return "rno: "+rno+"\n name: "+name+"\n per: "+per;
		
	}
}

public class SerialazableDemo {
	public static void main(String[] args) throws Exception {
		Student s=new Student(1,"amrit", 80.00);
		FileOutputStream fos= new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		System.out.println("obj written successfully");

		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Student s2=(Student) ois.readObject();
		ois.close();
		System.out.println(s2);
	}

}
