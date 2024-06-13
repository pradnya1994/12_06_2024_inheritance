package com.javaIheritance;

//super/parent/base class
public abstract class Department implements College
{
	
	//fields/variables
	private int departmentId;
	private String departmentName;
	
	//initializers
	public Department()
	{
		
	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	
	//methods(setters and getters)
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
