package by.ld.unit02.main;

import java.util.Scanner;

public class Task08 {
	/*
	 * Составить программу, которая определит площадь какого треугольника больше.  
	 */

	public static void main(String[] args) {
		double a1, b1, c1, a2, b2, c2, s1=0, s2=0, p1=0, p2=0, s_max=0;
		int num=0;
		
		 Scanner sc= new Scanner(System.in);
		   
			System.out.println("Введите длину стороны А первого треугольника:");
			while(sc.hasNextDouble()==false) {
		    	String str;
				  str=sc.next();
				   System.out.println("Вы ввели '"+ str + "', а нужно ввести число!");
				   System.out.println("Введите длину стороны А первого треугольника:");
			   }
			    a1=sc.nextDouble();	
			     
			System.out.println("Введите длину стороны B первого треугольника:");		
			while(sc.hasNextDouble()==false) {
		    	String str;
				  str=sc.next();
				   System.out.println("Вы ввели '"+ str + "', а нужно ввести число!");
				   System.out.println("Введите длину стороны B первого треугольника:");	
			   }			
			     b1=sc.nextDouble();
			     
			System.out.println("Введите длину стороны C первого треугольника:");		
				while(sc.hasNextDouble()==false) {
				    	String str;
						  str=sc.next();
						   System.out.println("Вы ввели '"+ str + "', а нужно ввести число!");
						   System.out.println("Введите длину стороны C первого треугольника:");	
					   }			
					     c1=sc.nextDouble();	
					/*****/     
			
			System.out.println("Введите длину стороны А  второго треугольника:");
				while(sc.hasNextDouble()==false) {
						  String str;
						   str=sc.next();
						 System.out.println("Вы ввели '"+ str + "', а нужно ввести число!");
					     System.out.println("Введите длину стороны А второго треугольника:");
							   }
					a2=sc.nextDouble();	
							     
			System.out.println("Введите длину стороны B второго треугольника:");		
				while(sc.hasNextDouble()==false) {
					String str;
				    str=sc.next();
				    System.out.println("Вы ввели '"+ str + "', а нужно ввести число!");
				    System.out.println("Введите длину стороны B второго треугольника:");	
							   }			
					  b2=sc.nextDouble();
							     
			 System.out.println("Введите длину стороны C второго треугольника:");		
				while(sc.hasNextDouble()==false) {
					String str;
					str=sc.next();
					System.out.println("Вы ввели '"+ str + "', а нужно ввести число!");
					System.out.println("Введите длину стороны C второго треугольника:");	
									   }			
				   c2=sc.nextDouble();						     
			       sc.close();
			       
			       p1=0.5*(a1+b1+c1);			       
			       if (a1>p1 | b1>p1 | c1>p1) {
			    	   System.out.println("Одна из сторон первого треугольника больше его полупериметра! "
			    	   		+ "Площадь не может быть вычислена!");
			    	   return;
			       }
			       
			       p2=0.5*(a2+b2+c2);
			       if (a2>p2 | b2>p2 | c2>p2) {
			    	   System.out.println("Одна из сторон  второго треугольника больше его полупериметра! "
			    	   		+ "Площадь не может быть вычислена!");
			    	   return;
			       }
			       
			      			       
			       s1=Math.sqrt(p1*(p1-a1)*(p1-b1)*(p1-c1));
			       s2=Math.sqrt(p2*(p2-a2)*(p2-b2)*(p2-c2));
			       
			       if (s1>s2) {
				    	 s_max=s1;	
				    	 num=1;				    	 
				     } else if (s2>s1) {
				    	 s_max=s2;
				    	 num=2;
				     } else  { System.out.println("Площади обоих треугольников равны!"+s1+" Нет наибольшего!");
				    	 return;
					     }
				        
				   System.out.printf("Площадь наибольшего треугольника = %.2f (треугольник номер " +num+")", s_max);
		      

	}

}
