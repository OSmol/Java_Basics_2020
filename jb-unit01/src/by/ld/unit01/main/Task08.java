package by.ld.unit01.main;

public class Task08 {
	/*
	 * 8. Вычислить значение выражения по формуле
	 *  (все переменные принимают действительные значения): (𝑏 + √(𝑏2 + 4𝑎𝑐))/ 2𝑎 − 𝑎3𝑐 + 𝑏−2 
	 */

	public static void main(String[] args) {
		double a, b, c, q;
		double part1, part2, result;
		
		a=0.1;
		b=2;
		c=3;
		
		part1=0;
		part2=0;
		result=0;
		
		q=Math.sqrt(Math.pow(b,2)+4*a*c);
		part2=Math.pow(a, 3) *c+Math.pow(b, -2);
		
		if (a!=0) {
			part1=(b+q)/2*a;
		} else {
			System.out.println("Нельзя делить на ноль!");
			part1=Double.NaN;
			part2=Double.NaN;
		}
					
		result=part1+part2;
			
		System.out.printf("Результат математического выражения: %.3f " ,result);
		

		
	}

}
