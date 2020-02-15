package by.ld.unit01.main;

public class Task09 {
	/*
	 * 9. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	 *  𝑎/𝑐 ∗ 𝑏 /𝑑 − (𝑎𝑏 − 𝑐)/𝑐𝑑
	 */

	public static void main(String[] args) {
		double a, b, c, d;
		double part1, part2, part3, result;
		
		a=1;
		b=2;
		c=0.3;
		d=0.5;
		
		part1=0;
		part2=0;
		part3=0;
		result=0;
		
		if (c!=0 && d!=0) {
			part1=a/c;
		    part2=b/d;
		    part3=(a*b-c)/c*d;	
		    result=part1*part2-part3;
			  } else {	
				result=Double.NaN;
				System.out.println("Нельзя делить на ноль!");	
				}
				    
      
      System.out.printf("Результат математического выражения: %.3f " ,result);
		
	}

}
