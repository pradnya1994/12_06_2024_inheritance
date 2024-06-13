package com.javaIheritance;

public class TestClass1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Student student1 = new Student(101, "Arun", "B.Tech CSE Final Year", 78.67F);
		
		System.out.println(student1.getStudentId());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getStudentClass());
		System.out.println(student1.getStudentMarks());
		
		System.out.println();
		
		student1.setDepartmentId(1022);
		student1.setDepartmentName("CSE");		
		System.out.println(student1.getDepartmentId());
		System.out.println(student1.getDepartmentName());
		
	}

}
