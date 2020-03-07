package by.ld.unit02.main;

import java.util.Scanner;

public class Task13 {
	/*
	 * Найдите наибольшую цифру данного натурального числа.
	 */

	public static void main(String[] args) {
		 int num=0, max=0, digit=0;
		 
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

			  while (num!= 0) 
		            {
					digit = num % 10;
			    	 if (digit > max) {
			    		 max=digit;
			    	 	 } 
					num = num / 10;  
		             }
			  
		    	 System.out.println("Наибольшая цифра данного натурального числа: "+max); 
		    			         
		    	 System.out.println("Завершение программы!"); 
		    	 		
	}

}
