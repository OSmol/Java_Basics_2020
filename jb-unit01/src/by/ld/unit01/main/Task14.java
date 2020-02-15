package by.ld.unit01.main;

public class Task14 {
 /*
  * 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R. 
  */
	
	public static void main(String[] args) {
		double r;
		double p=0, s=0;
		
		r=10.3;
		
		p=2*Math.PI*r;
		s=Math.PI*r*r;
		
		System.out.printf("Круг с радиусом %.2f имеет площадь %.2f и длину окружности %.2f",r,s,p);
		
		
	}

}
