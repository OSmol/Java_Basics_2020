package by.ld.unit02.main;

import java.util.Scanner;

public class FirstTask3 {
	/*
	 * Составить программу сравнения введенного числа а и цифры 3.
	 * Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».  
	 */

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
				
		int x;		

		System.out.println("Enter the number:");
		x=sc.nextInt();
	       if (x<3) {
		System.out.println("yes");	
	        } else {
	    System.out.println("no");
	        }
		
	System.out.println("Finish program!");	

	}

}

