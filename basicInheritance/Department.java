package com.basicInheritance;

public abstract class Department implements College 
{
	private int departmentId;
	private String departmentName;
	
	public Department()
	{
		
	}
	
	
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	

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


	public void getDepartmentDetails()
	{
		System.out.println(departmentId);
		System.out.println(departmentName);
	}

}
