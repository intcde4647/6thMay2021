package com.cts.demo1;

import java.util.Scanner;

/* In the below class , we
 * are going to keep member variables/attributes/properties
 * and member methods/behaviour
    If we declare members as private, they are accessible in the same class and are not
    accessible outside the class
 *  Whenver we design this sort of class Employee we have two things 1) member variables
 *  2) member methods
 *  We usually keep the member variables as private and member methods as public
 */
public class Employee {
   // employeeId,employeeName,designation,department,basic are member variables
	
   private int employeeId;
   private String employeeName;
   private String designation;
   private String department;
   private int basic;
   // setData() and displayData() are member methods
   public void setData() {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the employee id");
	    employeeId=scanner.nextInt();
		System.out.println("Enter the employee's name");
		employeeName=scanner.next();
		System.out.println("Enter the designation for the employee");
		designation=scanner.next();
		System.out.println("Enter the department for the employee");
		department=scanner.next();
		System.out.println("Enter the basic for the employee");
		basic=scanner.nextInt();
   }
   public void displayData() {
	   
	     System.out.println("The details are :");
		System.out.println("ID:"+employeeId);
		System.out.println("NAME: "+employeeName);
		System.out.println("DESIGNATION: "+designation);
		System.out.println("DEPARTMENT: "+department);
		System.out.println("BASIC: "+basic);
   }
   
}
