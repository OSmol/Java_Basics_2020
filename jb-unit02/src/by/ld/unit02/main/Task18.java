package by.ld.unit02.main;

import java.util.Scanner;

public class Task18 {
	/*
	 * Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
	 * Результат представить в виде таблицы, первый столбец которой – значения  аргумента, 
	 * второй - соответствующие значения функции: 
	 * F(x)=(sin x) * (sin x)
	 * 
	 */

	public static void main(String[] args) {
		double a=0,b=0,h=0,f=0;
		double temp=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Введите a:");
		        a=sc.nextDouble();	
		     
		System.out.println("Введите b:");		
		      temp=sc.nextDouble();
		     if (temp<a) {
		       System.out.println("You entered a and b in incorrect order! a and b will replace each other!"); 
		         b=a;
		         a=temp;
		     } else { 
		    	 b=temp;
		     }
	 
		 System.out.println("Введите h:");	
		        h=sc.nextDouble();
		    if (h>Math.abs(b-a)) {
		        	 System.out.println("Step h is very big! Please, enter the number less than: "+Math.abs(b-a));
		        	 System.out.println("Enter all arguments again!");	
		        	 sc.close();
		        	 return;
		        } 
		    	   
		    sc.close();  
		    
		    System.out.println("-----------------------");
			System.out.println("       Таблица       ");
		    System.out.println("-----------------------");
			System.out.println("|    X:   | Результат: |");
						
			do {
				f=Math.pow(Math.sin(a),2);			
				System.out.printf("| x=%.2f; |  F(x)=%.2f | \n",a,f);
				a=a+h;			
				} while (a<=b);
			
			
			//calculate last point if we do not have integer amount of steps
			if ((a-b)%h!=0){
			   f=Math.pow(Math.sin(b),2);	
			   System.out.printf("| x=%.2f; |  F(x)=%.2f | \n",b,f);
			}
			
			System.out.println("Завершение программы!");
		    } 
		
	}

