package org.automation.testGit;

public class EmplyeeTest
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.setEmpName("Steve");
		emp1.setEmpNo(201);		

		Employee emp2=new Employee();
		emp2.setEmpName("John");
		emp2.setEmpNo(202);		
		
		System.out.println("Employee details");

		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpNo());
		
		System.out.println(emp2.getEmpName());
		System.out.println(emp2.getEmpNo());
	}
}
