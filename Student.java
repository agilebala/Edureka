package com.edureka;

public class Student {
	int reg_no;
	String name;
	String stream;
	String college; 
	//Constructor 
	Student(int no, String na,String major,String co)
	{
		reg_no = no;
		name = na;
		stream = major;
		college = co;
		System.out.println("In the constructor with arguments");
	}

	public static void main(String[] args) 
	{
	
		Student student_1 = new Student(10,"john","CS","JMC");
		System.out.println("Student Name : " +student_1.name);
		System.out.println("Student Stream : " +student_1.stream);
		System.out.println("Student Info : " +student_1);
		
	
	}

}
