package by.ld.unit03.main;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
	
		char sale, buy;
	
		double amount=0, x=0;
				
		double rate_BYR_USD=2.321;
		double rate_USD_BYR=2.317;
		
		double rate_BYR_EUR=2.624;
		double rate_EUR_BYR=2.622;
		
		double rate_USD_EUR=1.130;
		double rate_EUR_USD=1.143;
				
		 
		Scanner sc= new Scanner(System.in);		
				
			System.out.println("Выберите, пожалуйста, валюту, которую вы продаете:");
			System.out.println(" BYR [1], USD [2], EUR [3]");
			sale=sc.next().charAt(0);
			
			System.out.println("Выберите, пожалуйста, валюту, которую вы покупаете:");
			System.out.println("  BYR [1], USD [2], EUR [3]");
			buy=sc.next().charAt(0);
			
			System.out.println("Введите сумму:");
			System.out.println("-----------------------");
			amount=Double.parseDouble(sc.next());
			
			sc.close();
			
			 
		     	if (sale=='1' & buy=='2') {
		     		x=rate_BYR_USD;
		     	} else if (sale=='2' & buy=='1') {	
		     		x=rate_USD_BYR;    
	            } else if (sale=='1' & buy=='3') {	            	
	            	x=rate_BYR_EUR;	            	
	            } else if (sale=='3' & buy=='1') {	            	
	            	x=rate_EUR_BYR;
	            } else if (sale=='2' & buy=='3')  {
	            	x=rate_USD_EUR;
	            } else if (sale=='3' & buy=='2') {
	            	x=rate_EUR_USD;
	            } else {
	            	System.out.println("Такого варианта перевода валюты нет!");
	            }
		     	
		    		
		     	CalcResult(amount, x);
		     	
	
		     	
	
	}
	
	 public static void CalcResult( double a, double b) {    	
    	  double res;
    	     res=a*b; 
    	     System.out.printf("Результируюущая сумма: %.3f ",res);
			 return;
	     } 

}
// задачи модуля 3 защитаны
