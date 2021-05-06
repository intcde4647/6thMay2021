package com.cts.demo2;

import java.util.Scanner;

import com.cts.demo1.Employee;

// For import ctrl+shift+o
public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		employee1.setData();
		employee2.setData();
		employee1.displayData();
		employee2.displayData();
		
	}

}
