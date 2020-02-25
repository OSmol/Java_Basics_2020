package by.ld.unit02.main;

import java.util.Scanner;

public class Task01 {
	/*
	 * Составить программу: равны ли два числа а и b?  
	 * 
	 */

	public static void main(String[] args) {
		int a,b;
		
	   Scanner sc= new Scanner(System.in);
		
	   System.out.println("Enter a:");
		while(sc.hasNextInt()==false) {
	    	String str;
			  str=sc.next();
			   System.out.println("You entered '"+ str + "', but you should enter INTEGER value!");
			   System.out.println("Enter a:");
		   }
		    a=sc.nextInt();	
		     
		System.out.println("Enter b:");		
		while(sc.hasNextInt()==false) {
	    	String str;
			  str=sc.next();
			   System.out.println("You entered '"+ str + "', but you should enter INTEGER value!");
			   System.out.println("Enter b:");
		   }
		
		     b=sc.nextInt();	

		     sc.close();
		     
		     if (a==b) {
		    	 System.out.println("Numbers a and b are equal!");
		     } else {
		    	 System.out.println("Numbers a and b are NOT equal!");
		     }

	}

}
