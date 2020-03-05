package by.ld.unit02.main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Task11 {
	/*
	 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
	 * 
	 */

	public static void main(String[] args) {
		
		int a, b, i=0, j=0, digit1=0, digit2=0;
		

ArrayList<Integer> a_list = new ArrayList<Integer>();
ArrayList<Integer> b_list = new ArrayList<Integer>();
HashSet<Integer> res_list = new HashSet<Integer>();
		
		
		  Scanner sc= new Scanner(System.in);		
		   
			System.out.println("Enter a:");
			while(sc.hasNextInt()==false) {
		    	String str;
				  str=sc.next();
				   System.out.println("You entered '"+ str + "', but you should enter INTEGER value!");
				   System.out.println("Enter a:");
			   }
			  a=Math.abs(sc.nextInt());	
		
				System.out.println("Enter b:");		
				while(sc.hasNextInt()==false) {
			    	String str;
					  str=sc.next();
					   System.out.println("You entered '"+ str + "', but you should enter INTEGER value!");
					   System.out.println("Enter b:");
				   }
				
				 b=Math.abs(sc.nextInt());
				 
				 sc.close();
		
		
     while (a!= 0) 
            {
			digit1 = a % 10;  
 			a_list.add(digit1);
			a = a / 10;  
             }
		
     while (b!= 0) 
            {
			digit2 = b % 10; 
			b_list.add(digit2);
			b = b/ 10;     
             }
     
      
     for (i=0; i<a_list.size(); i++) {
    	   digit1=a_list.get(i);
    	 for (j=0; j<b_list.size(); j++) {
    		 digit2=b_list.get(j);
    		 if (digit1==digit2) {
    			res_list.add(digit1);    	
    		 }     		
    	 }
     }


System.out.println("Цифры, которые входят в число А и В: "+res_list);  
       
System.out.println("Завершение программы!"); 
		
	}
}

