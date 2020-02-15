package by.ld.unit01.main;

public class Task11 {
	/*
	 * 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов. 
	 */
	public static void main(String[] args) {
		double a, b, hypot=0;
		double triangleArea=0, trianglePerimetr=0;
		
		a=13;
		b=16;
				
		hypot=Math.hypot(a, b); 
		trianglePerimetr=a+b+hypot;
	    triangleArea=0.5*a*b;
		    
        System.out.printf("Прямоугольный треугольник с катетами %.3f и %.3f "
	    		+ "имеет периметр %.3f и площадь %.3f " ,a, b, trianglePerimetr, triangleArea);
	}

}
