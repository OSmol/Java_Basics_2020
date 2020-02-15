package by.ld.unit01.main;


public class Task13 {
	
	/*
	 * 13. Заданы координаты трех вершин треугольника  (х1, у1),(х2, у2),(х3, у3).
	 *  Найти его периметр и площадь. 
	 */

	public static void main(String[] args) {
		double x1,y1, x2, y2 , x3 , y3;
		double a=0, b=0, c=0, s=0, p=0;
		
		x1=29;
		y1=5;
		
		x2=31;
		y2=33;
		
		x3=64;
		y3=25;
		
		a=Math.hypot((x2-x1),(y2-y1));
		b=Math.hypot((x3-x2),(y3-y2));
		c=Math.hypot((x3-x1),(y3-y1));
		
		p=0.5*(a+b+c);
		
		s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
	

		System.out.printf("Площадь треугольника с координатами ("+x1+","+y1+"), "
	    		+ "("+x2+","+y2+") и ("+x3+","+y3+") равна %.1f ",s);
				
		
	}
}
