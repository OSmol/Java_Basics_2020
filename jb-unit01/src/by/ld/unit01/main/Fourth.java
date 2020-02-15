package by.ld.unit01.main;

public class Fourth {
	/*
	 * Напишите программу нахождения гипотенузы и площади прямоугольного треугольника по двум катетам.
	 */

	public static void main(String[] args) {
		
	  double cathetA= 15;
      double cathetB =20;
      
      double hypotenuse=0;
      double triangleArea=0;
      
      hypotenuse=Math.hypot(cathetA, cathetB);    	 
      triangleArea=0.5*cathetA*cathetB;
      
      System.out.println("Hypotenuse: "+hypotenuse);
      System.out.println("Triangle Area: "+triangleArea);
 
	}

}
