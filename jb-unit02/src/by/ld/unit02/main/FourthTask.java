package by.ld.unit02.main;

import java.util.Scanner;

public class FourthTask {
/*
 * Вычислить значение функции:  
 * F(x) = 9, если x< = -3,
 * F(x)= 1/(x*x+1), если x>3 

 */
	public static void main(String[] args) {
		double x, f;
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter x:");
		       x=sc.nextDouble();	
		       sc.close();
		       
		       if (x<= -3) {
		    	   System.out.println("F(x)=9");
		       } else if (x>3) {
		    	   f=1/(x*x+1);
		    	   System.out.printf("F(x)= %.2f \n", f);
		       } else {
		    	   System.out.println("You entered x >3 OR x< = -3!. Result is not defined!");
		       }
		       System.out.println("Finish!");
	}

}
