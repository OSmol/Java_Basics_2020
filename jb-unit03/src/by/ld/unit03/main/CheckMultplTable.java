package by.ld.unit03.main;

import java.util.Random;
import java.util.Scanner;

public class CheckMultplTable {
	/*
	 * Напишите консольное приложение, проверяющее знание таблицы умножения. 
	 */

	public static void main(String[] args) {
		
		int a=0, b=0, circle_num=1;		
	
	    Scanner sc= new Scanner(System.in);		
				
		circle_num=1+generateNum(3);
		
		System.out.println("Начинаем проверку. У вас будет следующее количество заданий: "+circle_num+".");
		System.out.println("-----------------------");
		
		while (circle_num!=0) {
				
				a=generateNum(11);
				b=generateNum(11);							
		   			
			System.out.println("Введите, пожалуйста, результат умножения "+a+" x "+b+" :");
			
			isInt(sc);
	
		    while(sc.nextInt()!=a*b) {				  
			      System.out.println("Ответ неверен! Введите, пожалуйста, результат умножения еще раз:");	
			      isInt(sc);
			    }
							  
			  System.out.println("Верный ответ! Поздравляем!");
								  
			  circle_num=circle_num-1;
			  
			}
		
		sc.close();
		System.out.println("-----------------------");
		System.out.println("Проверка закончена!");

	}


      public static int generateNum(int z) {
    	  int c;
    	  Random rndm = new Random();
    	  
    	  c=rndm.nextInt(z);  	   
    	  return c;
            }


     public static void isInt(Scanner sc) {    	
     	  while(sc.hasNextInt()==false) {
    		  String str;
	    	  str=sc.next();
			   System.out.println("Вы ввели '"+ str + "', но это не целое число! Ответ неверен!");
			   System.out.println("Введите, пожалуйста, результат умножения еще раз:");		;
	     } 
    	  	 
        }
      
      
      }
