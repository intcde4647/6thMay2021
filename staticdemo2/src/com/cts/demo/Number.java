package com.cts.demo;

public class Number {
   private int member_variable_num;
   private static int static_variable_num;
    
   // we created a setData member method to access member variable
   public void setData(int num1)
   {
	   member_variable_num=num1;
   }
   // we created a setDataStatic to store the static member data
   public static void setDataStatic(int num2)
   {
	   static_variable_num=num2;
   }
   // for display of the member variable we created a dispData
   public void dispData()
   {
	 System.out.println(member_variable_num);
   }
   // we created a dispDataStatic to displaythe static member
   public static void dispDataStatic()
   {   // The below line shows compilation error because from a static method we are trying
	   // to access a non static member
	   //System.out.println(member_variable_num);
	  System.out.println(static_variable_num);
   }

}
