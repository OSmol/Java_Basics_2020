package by.ld.unit02.main;

public class Task19 {
/*
 * Вывести на экран соответствий между символами и
 *  их численными обозначениями в памяти компьютера (Таблицу ASCII). 
 * 
 */
	public static void main(String[] args) {
		char ch;
		
	System.out.println("Таблица ASCII:"); 

    for (int i=33; i<127; i++) {
    	ch=(char)i;
    	System.out.print(ch+", \n");  
	       
		
    }
    System.out.println("Завершение программы!"); 

	}

}
