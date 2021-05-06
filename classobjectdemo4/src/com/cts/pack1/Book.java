package com.cts.pack1;

import java.util.Scanner;

public class Book {
  private int id;
  private String title;
  private String authorName;
  private float price;
  
  public void setData()
  {
	  Scanner scan=new Scanner(System.in);
      System.out.println("Enter the book id");
      id=scan.nextInt();
      System.out.println("Enter the book title");
      title=scan.next();
      System.out.println("Enter the author name");
      authorName=scan.next();
      System.out.println("Enter the price");
      price=scan.nextFloat();
  }
  
  public void dispData()
  {
	  System.out.println("ID "+id);
	  System.out.println("TITLE "+title);
	  System.out.println("AUTHOR's NAME "+authorName);
	  System.out.println("PRICE "+price);
  }
}
