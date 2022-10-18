package javaP;


/*• Create a class named 'Member' having the following members: 
1. Data members 
2. Name 
3. Age 
4. Phone number 
5. Address 
6. Salary 
It also has a method named 'printSalary' which prints the salary of the members.*/


public class AssignMember {
	String name;
	int age;
	int phoneno;
	String add;
	double sal;
	public  AssignMember(String name, int age, int phoneno, String add, double sal) {
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.add = add;
		this.sal = sal;
		System.out.println( "name: "+name+"\n age: "+age+"\n phone no: "+phoneno+"\n address: "+add+"\n Salary: "+sal);
		
	
	}
	
	
	public static void main(String[] args) {
		
	    new AssignMember("amrit", 21, 243,"h no 101, padwa gali,sindrath,sirohi,rajasthan", 34554);
	}

}
