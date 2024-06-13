package com.basicInheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		
		stu.setStudentRollNo(101);
		stu.setStudentName("Pradnya");
		stu.setStudentMarks(80.50f);
		stu.setStudentClass("F.Y");
		
		stu.setDepartmentId(1001);
		stu.setDepartmentName("I.T");
		
		stu.getStudentDetails();
		System.out.println();
		stu.getDepartmentDetails();
		System.out.println();
		System.out.println(College.collegeName);

	}

}
