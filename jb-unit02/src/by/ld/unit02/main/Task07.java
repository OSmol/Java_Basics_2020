package by.ld.unit02.main;

import java.util.Scanner;

public class Task07 {
   /*
    * Составить программу, которая определит площадь какого круга меньше.
    * 
    */
	public static void main(String[] args) {
		double r1, r2, sq1=0, sq2=0, sq_min=0, min=0;
		
		 Scanner sc= new Scanner(System.in);
		   
			System.out.println("Enter the first radius:");
			while(sc.hasNextDouble()==false) {
		    	String str;
				  str=sc.next();
				   System.out.println("You entered '"+ str + "', but you should enter NUMBER!");
				   System.out.println("Enter the first radius:");
			   }
			    r1=sc.nextDouble();	
			     
			System.out.println("Enter the second radius:");		
			while(sc.hasNextDouble()==false) {
		    	String str;
				  str=sc.next();
				   System.out.println("You entered '"+ str + "', but you should enter NUMBER!");
				   System.out.println("Enter the first radius:");
			   }			
			     r2=sc.nextDouble();
			     sc.close();
			     
			     sq1=Math.PI*r1*r1;
			     sq2=Math.PI*r2*r2;
			     
			     if (sq1<sq2) {
			    	 sq_min=sq1;	
			    	 min=r1;
			     } else if (sq1>sq2) {
			    	 sq_min=sq2;
			    	 min=r2;
			     } else  {  System.out.println("The circles are equal, their areas are equal too! No smallest!");
			    	 return;
				     }
			        
			   System.out.printf("The smallest area is %.2f (radius %.2f)", sq_min, min);
		}
			     
	}

