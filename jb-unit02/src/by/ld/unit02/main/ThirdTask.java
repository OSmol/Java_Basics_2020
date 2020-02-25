package by.ld.unit02.main;

import java.util.Scanner;

public class ThirdTask {
	/*
	 * Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
	 * Результат представить в виде таблицы, первый столбец которой – значения  аргумента,
	 *  второй - соответствующие значения функции F(x)=2*tg(x/2)+1
	 */

	public static void main(String[] args) {
		double a=0,b=0,h=0,f=0;
		double temp=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a:");
		        a=sc.nextDouble();	
		     
		System.out.println("Enter b:");		
		      temp=sc.nextDouble();
		     if (temp<a) {
		       System.out.println("You entered a and b in incorrect order! a and b will replace each other!"); 
		         b=a;
		         a=temp;
		     } else { 
		    	 b=temp;
		     }
		
		
		
	    System.out.println("Enter h:");	
	        h=sc.nextDouble();
	    if (h>Math.abs(b-a)) {
	        	 System.out.println("Step h is very big! Please, enter the number less than: "+Math.abs(b-a));
	        	 System.out.println("Enter all arguments again!");	
	        	 sc.close();
	        	 return;
	        } 
	    	   
	    sc.close();
	    
	    System.out.println("-------------------");
		System.out.println("Table");
		System.out.println("-------------------");
		System.out.println("Arg X:  Result:");
					
		do {
			f=2*Math.tan(a/2)+1;			
			System.out.printf("a=%.2f; F(x)=%.2f \n",a,f);
			a=a+h;			
			} while (a<=b);
		
		
		//calculate last point if we do not have integer amount of steps
		if ((a-b)%h!=0){
		  f=2*Math.tan(b/2)+1;
		  System.out.printf("a=%.2f; F(x)=%.2f \n",b,f);
		}
		
		System.out.println("Finish!");
	    } 
	
}	

