package by.ld.unit02.main;

import java.util.Scanner;

public class Task10 {
	/*
	 *  Найти max{min(a, b), min(c, d)}.  
	 */

	public static void main(String[] args) {
		int a,b,c,d;
		int min1=0, min2=0, max=0;
		
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
			     
				System.out.println("Enter c:");
					while(sc.hasNextInt()==false) {
				    	String str;
						  str=sc.next();
						   System.out.println("You entered '"+ str + "', but you should enter INTEGER value!");
						   System.out.println("Enter c:");
					   }
					c=sc.nextInt();	
					     
				System.out.println("Enter d:");		
					while(sc.hasNextInt()==false) {
				    	String str;
						  str=sc.next();
						   System.out.println("You entered '"+ str + "', but you should enter INTEGER value!");
						   System.out.println("Enter d:");
					   }
					
					 d=sc.nextInt();
			     
			         sc.close();
			         
			  if (a>b) {
				  min1=a;
			  } else {
				  min1=b;
			  }
			     
			  if (c>d) {
				  min2=c;
			  } else {
				  min2=d;
			  }
			  
			  if (min1>min2) {
				  max=min1;
			  } else {
				  max=min2;
			  }
			  
		System.out.println("Максимум равен "+max+" !");

	}

}
