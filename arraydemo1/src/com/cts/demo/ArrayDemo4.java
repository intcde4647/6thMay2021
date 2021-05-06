package com.cts.demo;
import java.util.Scanner;
   public class ArrayDemo4 {

     public static void main(String args[]) {
 
    Scanner scan=new Scanner(System.in);  
    int num[]=new int[5];
     System.out.println(num.length);
     for(int i=0;i<num.length;i++)
      {
       System.out.println("Enter the number");
       num[i]=scan.nextInt();    
     
      }
     System.out.println("The values are:");
     for(int x : num)
       {
        System.out.println(x);
       }

    }
  }
