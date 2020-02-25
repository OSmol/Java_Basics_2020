package by.ld.unit02.main;

import java.util.Scanner;

public class Task03 {
	/*
	 * Составить программу: определения наибольшего из двух чисел а и b.  
	 * 
	 */

	public static void main(String[] args) {
		int a,b,max=0;
		
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
			     
			     if (a<b) {
			    	 max=b;
			     } else if (a>b) {
			    	 max=a;
			     } else {
			    	 System.out.println("The numbers are equal! No biggest!");
			    	 return;
			     }
			     
			     
			     System.out.println("The biggest number is "+max+" !");
			     

	

	}

}
