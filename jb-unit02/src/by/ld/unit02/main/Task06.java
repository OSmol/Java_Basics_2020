package by.ld.unit02.main;

import java.util.Scanner;

public class Task06 {
	/*
	 * Составить программу, 
	 * которая определит по трем введенным сторонам,
	 * является ли данный треугольник равносторонним. 
	 */

	public static void main(String[] args) {
			
		double a,b,c;
		
		   Scanner sc= new Scanner(System.in);
					   
			System.out.println("Enter the length of the first side of the triangle:");
			while(sc.hasNextDouble()==false) {
		    	String str;
				  str=sc.next();
				   System.out.println("You entered '"+ str + "', but you should enter NUMBER!");
				   System.out.println("Enter the length of the first side of the triangle again:");
			   }
			    a=sc.nextDouble();	
			     
			System.out.println("Enter the length of the second side of the triangle:");		
			while(sc.hasNextDouble()==false) {
		    	String str;
				  str=sc.next();
				   System.out.println("You entered '"+ str + "', but you should enter NUMBER!");
				   System.out.println("Enter the length of the second side of the triangle again:");
			   }			
			   b=sc.nextDouble();	
			   
			   System.out.println("Enter the length of the third side of the triangle:");		
				while(sc.hasNextDouble()==false) {
			    	String str;
					 str=sc.next();
					 System.out.println("You entered '"+ str + "', but you should enter NUMBER!");
					 System.out.println("Enter the length of the third side of the triangle again:");
				}
				 c=sc.nextDouble();			   
			     sc.close();
			     
			     if (a==b & b==c & c==a) {
			    	 System.out.printf("This triangle is equilateral triangle with the sides = %.2f", a);
				    
			         } else if (a==b | b==c | a==c) {
			    		 System.out.printf("This triangle is NOT equilateral triangle, but isosceles triangle with sides: %.2f, %.2f, %.2f", a, b, c);
			         } else 
			         {
			        	 System.out.println("This triangle is neither equilateral triangle, nor isosceles triangle!");
			         } 			      
	}

}
