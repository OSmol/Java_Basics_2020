package by.ld.unit02.main;

public class Task11 {
	/*
	 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
	 * 
	 */

	public static void main(String[] args) {
		int a, b, digit=0;
		
		
		a=123;
		b=567;
		
System.out.println("Числo A состоит из цифр:");  
		
     while (a!= 0) 
            {
			digit = a % 10;  
			a = a / 10;    
			System.out.println(digit);    
             }
     
 System.out.println("Числo B состоит из цифр:");  
		
     while (b!= 0) 
            {
			digit = b % 10;  
			b = b/ 10;    
			System.out.println(digit);    
             }
		
     System.out.println("Завершение программы!"); 
		}

	}

