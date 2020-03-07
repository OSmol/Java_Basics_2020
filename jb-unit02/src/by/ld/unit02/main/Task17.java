package by.ld.unit02.main;

public class Task17 {
	/*
	 * Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1). 
	 * 
	 */

	public static void main(String[] args) {
		double a=-15.11;
		int n=9;
		double res=1;
		
		for (int i=0; i<=n-1; i++) {
			res=res*(a+i);
			System.out.println("Шаг: "+i);
			System.out.println("Промежуточный результат: "+res); 
		}
		
		System.out.println("----------------------- "); 
	 	System.out.printf("Результат: %.3f \n",res); 
        
   	 System.out.println("Завершение программы!"); 
	}

}
