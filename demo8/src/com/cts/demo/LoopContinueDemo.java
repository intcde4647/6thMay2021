 package com.cts.demo;
   import java.util.Scanner;

    public class LoopContinueDemo {

      public static void main(String args[]) {

        Scanner scan=new Scanner(System.in);
        int ctr=0;
        int sum=0;
        int num=0;  
        while(ctr<10){
             System.out.println("Enter the number");
             num=scan.nextInt();
             if(num<0){
            	 ctr++;
               continue;
               
             }
             sum=sum+num;
             ctr++;
             
        }
        System.out.println(sum);
     
     }

   }
