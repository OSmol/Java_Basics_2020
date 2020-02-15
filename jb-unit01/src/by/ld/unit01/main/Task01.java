package by.ld.unit01.main;

public class Task01 {
	/*
	 * 1. Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное. 
	 */

	public static void main(String[] args) {
		double x=13.4;
		double y=0;
		
		System.out.println("X=" +x);
		System.out.println("Y=" +y);
		
		double quot=0;
			
		double sum=x+y;
		System.out.println("Sum=" +sum);
		
		double diff=x-y;
		System.out.println("Difference=" +diff);
		
		double multipl=x*y;
		System.out.println("Multiplication=" +multipl);
		
		if (y!=0) {
			quot=x/y;				
		} else {
			System.out.println("Cannot be divided by zero!");
			quot=Double.NaN;		
		}
		System.out.println("Quotient=" +quot);
		
		
	}

}
