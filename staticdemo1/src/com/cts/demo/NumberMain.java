package com.cts.demo;

public class NumberMain {

	public static void main(String[] args) {
	   Number number1=new Number();
	   Number number2=new Number();
	   Number number3=new Number();
	   number1.member_variable_num=1;
	   number1.static_variable_num=2;
	   number2.member_variable_num=3;
	   number2.static_variable_num=4;
	   number3.member_variable_num=5;
	   number3.static_variable_num=6;
	   System.out.println(number1.member_variable_num);  //1
	   System.out.println(number1.static_variable_num);  //6 
	   System.out.println(number2.member_variable_num);  //3
	   System.out.println(number2.static_variable_num);  //6
	   System.out.println(number3.member_variable_num);  //5
	   System.out.println(number3.static_variable_num);  //6
	   System.out.println(Number.static_variable_num); // static members should be
	    // accessed by the class name rather than the object but member variable or
	    // instance variable are always accessed by the object
	}

}
