package by.ld.unit02.main;

import java.util.ArrayList;

public class Task14 {

	public static void main(String[] args) {
		int i=0, num4dig=0, sum=0, num=0;
		
		ArrayList<Integer> true_list = new ArrayList<Integer>();	
			
		for  (i=1000; i<10000; i++) {
		  num4dig=i;
          sum=0;
		     while (num4dig!= 0) 
	            {
		    	 num=num4dig % 10;	
		    	 sum=sum+num;		      
	 			 num4dig = num4dig/ 10;  	 			 	
	 			 }
		
		    if (sum==15) { 
				true_list.add(i);
			///	System.out.println("Четырехзначные числО, сумма цифр которых равна 15: "+i);  
			}
			
		}
		
		System.out.println("Четырехзначные числа, сумма цифр которых равна 15: "+true_list);  
	       
		System.out.println("Завершение программы!"); 
	}

}
