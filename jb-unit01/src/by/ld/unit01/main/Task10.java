package by.ld.unit01.main;

public class Task10 {
   /*
    * 10. Вычислить значение выражения по формуле 
    * (все переменные принимают действительные значения): ((𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦 ))∗ 𝑡𝑔 𝑥𝑦 
    */
	
	public static void main(String[] args) {
		double x, y;
		double denominator, result;
		x=1;
		y=2;
		
		result=0;
		denominator=0;
		
		denominator=Math.cos(x)-Math.sin(y);
		
		if (denominator!=0) {
			result=((Math.sin(x)+Math.cos(y))/denominator)*Math.tan(x*y);
			} else {
				result=Double.NaN;
				System.out.println("Нельзя делить на ноль!");
				   }
		 System.out.printf("Результат математического выражения: %.3f " ,result);

	}

}
