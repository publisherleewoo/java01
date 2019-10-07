package com.javalec.ex092;

import java.util.ArrayList;

public class StudentManeger {
	  ArrayList<Student> students = new ArrayList<Student>();
	
	
	public static void main(String[] args) {
		 Student s1 = new Student("홍길동",20,1);
		 Student s2 = new Student("강감찬",23,2);
		 Student s3 = new Student("김유신",30,3);
		 StudentManeger sm = new StudentManeger();
		 sm.students.add(s1);
		 sm.students.add(s2);
		 sm.students.add(s3);
		 System.out.println(sm.students.get(0).getAge());
		 System.out.println(sm.students.get(0).getName());
		 System.out.println(sm.students.get(1).getName());
		 System.out.println(sm.students.get(2).getName());
		 
	}

}
