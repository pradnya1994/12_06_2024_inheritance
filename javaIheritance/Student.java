package com.javaIheritance;

//sub/child/derived class
public class Student extends Department
{
	
	//fields/variables
	private int studentId;
	private String studentName;
	private String studentClass;
	private float studentMarks;

	public Student() {
		
	}

	public Student(int studentId, String studentName, String studentClass, float studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentMarks = studentMarks;
	}

	//methods(setter and getter methods)
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	
	
}
