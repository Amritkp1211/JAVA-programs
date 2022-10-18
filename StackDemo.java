package javaP;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
	Stack s=new Stack();
	s.add(10);
	s.push(34);
	s.add(3243);
	s.add("mart");
	s.add(null);
	s.push('a');
	s.push(34);
	s.push(34);
	s.push(true);
	System.out.println(s);
	s.pop();
	System.out.println(s);
	
	System.out.println(s.peek());
	}
	
	}

