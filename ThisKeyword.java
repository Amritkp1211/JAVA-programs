package javaP;
class Student
{
	int rno;
	String name;
	public Student() {
		System.out.println("default constructor");
	}
	public Student(int rno,String name)
	{
		this();
		System.out.println("parameterized constructor");
		this.rno=rno;
		this.name=name;
		
	}
	void display(Student s) {
		System.out.println("roll no: "+s.rno);
		System.out.println("Student Name: "+s.name);
	}
	void show() {
		this.display(this);
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		Student s=new Student(1,"amrit");
		s.show();
	}

}
