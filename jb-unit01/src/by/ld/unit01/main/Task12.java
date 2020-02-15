package by.ld.unit01.main;


public class Task12 {
	/*
	 * 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2). 
	 */

	public static void main(String[] args) {
		double x1,y1, x2, y2;
		double distance=0;
		
		x1=11;
		y1=11;
		
		x2=5;
		y2=5;
		
		distance=Math.hypot((x2-x1),(y2-y1));
		
        System.out.printf("Расстояние между точками с координатами ("+x1+","+y1+") и "
		    		+ "("+x2+","+y2+") равно %.3f ", distance);

	}

}
