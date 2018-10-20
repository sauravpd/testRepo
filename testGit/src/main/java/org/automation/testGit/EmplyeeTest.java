package org.automation.testGit;

public class EmplyeeTest
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.setEmpName("Steve");
		emp1.setEmpNo(201);		
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpNo());
	}
}
