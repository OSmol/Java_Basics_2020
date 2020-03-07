package by.ld.unit02.main;

public class Task16 {
  /*
   * Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). 
   */
	public static void main(String[] args) {
		int num=0, sum=1, sum_j;
	    long res=1;
	
		for (int i=2; i<=10; i++ ) {
			sum_j=0;
			for (int j=1; j<=i; j++) {
	 		    sum_j=sum_j+j;
			}
			System.out.println("Сумма в множителе: "+sum_j);
			res=res*sum_j;
			System.out.println("Промежуточный результат: "+res); 
		
			
		/*
			sum=sum+i;
			System.out.println("Сумма в множителе:"+sum);
			res=res*sum;
			System.out.println("Промежуточный результат: "+res); 
		*/	
			
		}
		 System.out.println("----------------------- "); 
	 	 System.out.println("Результат: "+res); 
         
    	 System.out.println("Завершение программы!"); 
	}

}
