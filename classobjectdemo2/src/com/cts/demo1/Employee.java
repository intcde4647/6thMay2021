package com.cts.demo1;

/* We created an Employee class with 
 * attributes/properties/member variables
 * employeeId, employeeName, designation
 * department and basic
 */

/* After defining or designing a class
 * we should create an object or objects*/
/* access specifier ====> default, private, protected, public */
/* If we dont mention private,protected or public the specifier is default */
/* For default specifier we need not to write default */
/* So in the employee class employeeID, employeeName and rest of the members are
 * having the default access specifier.
 * So default member are access by another class in the same package.
 * We wont be able access the members ie employeeId , employeeName because Employee class
 * and EmployeeMain are in different packages.
 * Now we will make the members as public so that they are accessible from other class
 * and other package
 * 
 */
public class Employee {
   public int employeeId;
   public String employeeName;
   public String designation;
   public String department;
   public int basic;
   
}
