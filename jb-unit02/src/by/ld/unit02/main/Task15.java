package by.ld.unit02.main;

import java.util.Scanner;

public class Task15 {
	/*
	 * Найдите количество четных цифр данного натурального числа.  
	 */

	public static void main(String[] args) {
		 int num=0, digit=0, i=0;
		 
		  Scanner sc= new Scanner(System.in);		
		   
			System.out.println("Введите натуральное число:");
			while (sc.hasNextInt()==false) {				
		    	  String str;
				  str=sc.next();
				   System.out.println("Вы ввели'"+ str + "', но вы должны ввести целое натуральное (неотрицательное) число!");
				   System.out.println("Введите, пожалуйста, натуральное число:");
			}
			
			   num=sc.nextInt();
			   sc.close();
			   
			   if (num<0) {
				   System.out.println("Вы ввели'"+ num + "', но вы должны ввести целое натуральное (неотрицательное) число! Запустите программу снова!");
				   return;
			   } 
       
			   if (num==0) {
				   i=1;
			   }
			   
				  while (num!= 0) 
		            {
					digit = num % 10;
			    	 if (digit % 2==0) {
			    		 i=i+1;
			    	 	 } 
					num = num / 10;  
		             }
				  
				 	 System.out.println("Количество четных цифр в данном числе: "+i); 
			         
			    	 System.out.println("Завершение программы!"); 
			    	 		
				  
	}

}
