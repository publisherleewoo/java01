package com.javalec.ex09;
import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students= new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent("홍길동", 22, 20123487, "연영과");
		studentManager.addStudent("홍길순", 32, 20153227, "수학과");
		studentManager.addStudent("이은경", 25, 20133487, "국문학과");
		studentManager.addStudent("김순희", 26, 20143585, "무용과");
		
		System.out.println(studentManager.students.get(0).getName());
		System.out.println(studentManager.students.get(0).getAge());
	}

	private void addStudent(String name, int age, int studentNum, String major) {
		Student student = new Student(name,age,studentNum,major);
		students.add(student);
		System.out.println(name + "학생 정보 입력 성공");
	}
	
	
}
