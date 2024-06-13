package com.basicInheritance;

public class Student extends Department
{
	private int studentRollNo;
	private String studentName;
	private float studentMarks;
	private String studentClass;
	
	public Student()
	{
		
	}
	
	public Student(int studentRollNo, String studentName, float studentMarks, String studentClass) {
		super();
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.studentClass = studentClass;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	
	public void getStudentDetails()
	{
		System.out.println(studentRollNo);
		System.out.println(studentName);
		System.out.println(studentMarks);
		System.out.println(studentClass);
	}
	

}
