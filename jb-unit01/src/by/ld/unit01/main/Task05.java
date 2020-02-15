package by.ld.unit01.main;

public class Task05 {
	/*
	 * 5. Составить алгоритм нахождения среднего арифметического двух чисел
	 */

	public static void main(String[] args) {
		double firstNumber=11.3;
		double secondNumber=53;
		double result=0;
		
		result=(firstNumber+secondNumber)/2;  //сложить числа и поделить результат на количество чисел , т.е на 2
		
		System.out.println("First Number: "+firstNumber);
		System.out.println("Second Number: "+secondNumber);
		System.out.println("Average = "+result);

	}

}
