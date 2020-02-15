package by.ld.unit01.main;

public class Task15 {
	/*
	 * 15. Написать программу, которая выводит на экран первые четыре степени числа π. 
	 */

	public static void main(String[] args) {
		 double result=0;
		
	for (int i=1; i<5; i++)	{
		result=Math.pow(Math.PI, i);
	    System.out.printf("Число Pi в степени "+i+" равно %.3f \n", result);
	  }
	}	

}
