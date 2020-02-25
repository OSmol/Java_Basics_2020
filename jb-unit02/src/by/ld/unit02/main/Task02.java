package by.ld.unit02.main;

import java.util.Scanner;

public class Task02 {
 /*
  * Составить программу: определения наименьшего из двух чисел а и b.    * 
  */
	public static void main(String[] args) {
		int a,b,min=0;
		
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
			    	 min=a;
			     } else if (a>b) {
			    	 min=b;
			     } else {
			    	 System.out.println("The numbers are equal! No smallest!");
			    	 return;
			     }
			     
			     
			     System.out.println("The smallest number is "+min+" !");
			     

	}

}
