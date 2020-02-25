package by.ld.unit02.main;

import java.util.Scanner;

public class Task04 {
	/*
	 * Составить программу нахождения модуля выражения a*x*x + b*x + c 
	 * при заданных значениях a, b, c и х. 	 * 
	 */

	public static void main(String[] args) {
		double a,b,c,x,f;
		 a=1.1;
		 b=2.2;
		 c=3.3;
		 x=0;
		 f=0;
		 
		 Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter x:");
			       x=sc.nextDouble();	
			       sc.close();
			  f=Math.abs(a*x*x+b*x+c);
			  
			  System.out.printf("Result f= %.2f \n",f);
			  
			  System.out.println("Finish!");
			       
	}

}
