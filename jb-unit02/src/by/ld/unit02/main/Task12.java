package by.ld.unit02.main;

import java.util.Scanner;

public class Task12 {
	/*
	 *  Проверить введенную пользователем строку на наличие недопустимых символов.
     *  В качестве первого символа допустимы только буквы и знак подчеркивания.
	 *  Остальные символы могут быть буквами, цифрами и знаком подчеркивания.  
	 */

	public static void main(String[] args) {
		

		char[] chars;
		String str ="";
				
		Scanner sc = new Scanner(System.in);  
				 
        System.out.print("Введите строку: ");   
        if (sc.hasNextLine()) {    
        	str = sc.nextLine(); 
       }
        
        sc.close();
        
         chars = str.toCharArray();
                        
         if (chars[0]!='_' & !Character.isLetter(chars[0])) {
        	 System.out.println("Начальный символ строки некорректный: "+chars[0]+". Введите букву или знак подчеркивания!");
         } else {   
           for (int i = 1; i < str.length(); i++) { 
            	 if (!Character.isLetterOrDigit(chars[i]) & chars[i]!='_') {
            		 System.out.println("Cимвол строки -  некорректен: "+chars[i]+". Введите букву, цифрe или знак подчеркивания!");
            	                                                           }  
                                                  } 
                } 
         

         
           System.out.println("Завершение программы!"); 
	}

}
