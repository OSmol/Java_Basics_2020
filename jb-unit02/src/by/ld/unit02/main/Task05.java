package by.ld.unit02.main;

public class Task05 {
	/*
	 * Составить прграмму нахождения наименьшего из квадратов двух чисел а и b.
	 */

	public static void main(String[] args) {
		double a, b, sq_a=0, sq_b=0, min=0, sq_min=0;// соблюдай правила именования идентификаторов
		
        a=4.3;
        b=1.3;
        
        sq_a=a*a;
        sq_b=b*b;
        
        
        if (sq_a<sq_b) {
        	sq_min=sq_a;
        	min=a;
        } else if (sq_a>sq_b) {
         	sq_min=sq_b;
         	min=b;
        } else {
          	 System.out.println("The numbers are equal, their squared numbers are equal too! No smallest!");
	    	 return;// не стоит Return использовать в неочевидном месте, это не ошика, но позволяет запутаться в коде
	     }
        
        System.out.printf("The smallest result is  %.2f (square of number %.2f)", sq_min, min);
        
	}

}
