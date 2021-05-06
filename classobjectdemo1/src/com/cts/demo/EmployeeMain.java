package com.cts.demo;

import java.util.Scanner;

// For import ctrl+shift+o
public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the employee id");
		employee.employeeId=scanner.nextInt();
		System.out.println("Enter the employee's name");
		employee.employeeName=scanner.next();
		System.out.println("Enter the designation for the employee");
		employee.designation=scanner.next();
		System.out.println("Enter the department for the employee");
		employee.department=scanner.next();
		System.out.println("Enter the basic for the employee");
		employee.basic=scanner.nextInt();
		System.out.println("The details are :");
		System.out.println("ID:"+employee.employeeId);
		System.out.println("NAME: "+employee.employeeName);
		System.out.println("DESIGNATION: "+employee.designation);
		System.out.println("DEPARTMENT: "+employee.department);
		System.out.println("BASIC: "+employee.basic);
		
	}

}
