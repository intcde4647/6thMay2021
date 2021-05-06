package com.cts.demo;

public class NumberMain {

	public static void main(String[] args) {
	   Number number1=new Number();
	   Number number2=new Number();
	   Number number3=new Number();
	   number1.setData(1);
	   number2.setData(2);
	   number3.setData(3);
	   Number.setDataStatic(6);
	   number1.dispData();
	   number2.dispData();
	   number3.dispData();
	   Number.dispDataStatic();
	}

}
