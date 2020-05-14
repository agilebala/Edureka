package com.practice.bala;
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
 Student()
 {
	 int count;

 }
 
	public static void main(String[] args) { 

		Student student_1 = new Student(10,"john","CS","JMC");
		System.out.println("Student Name : " +student_1.name);
		System.out.println("Student No : " +student_1.reg_no);
		System.out.println("Student College : " +student_1.college);
	
	}
 
}
