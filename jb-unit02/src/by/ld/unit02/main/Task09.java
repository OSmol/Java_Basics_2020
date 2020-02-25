package by.ld.unit02.main;

public class Task09 {
   /*
    * Даны три действительных числа. Возвести в квадрат те из них, 
    * значения которых неотрицательны, и в четвертую степень — отрицательные. 
    * 
    */
	public static void main(String[] args) {
		double a,b,c;
		double res1=0, res2=0, res3=0;
		
		a=1.2;
		b=-3.4;
		c=0.4;
				
		if (a>0) {
			res1=Math.pow(a,2);
			System.out.printf("Число "+a+" - положительное, квадрат числа = %.2f \n", res1);
		} else if (a<0){
			res1=Math.pow(a,4);
			System.out.printf("Число "+a+" - отрицательное, четвертая степень числа = %.2f \n", res1);
		} else {			
			System.out.println("Число "+a+" - ни положительное, ни отрицательное! Математических действий не требуется! \n");
		}
		
		
		if (b>0) {
			res2=Math.pow(b,2);
			System.out.printf("Число "+b+" - положительное, квадрат числа = %.2f \n", res2);
		} else if (b<0){
			res2=Math.pow(b,4);
			System.out.printf("Число "+b+" - отрицательное, четвертая степень числа = %.2f \n", res2);
		} else {			
			System.out.println("Число "+a+" - ни положительное, ни отрицательное! Математических действий не требуется! \n");
		}

		
		if (c>0) {
			res3=Math.pow(c,2);
			System.out.printf("Число "+c+" - положительное, квадрат числа = %.2f \n", res3);
		} else if (c<0){
			res3=Math.pow(b,4);
			System.out.printf("Число "+c+" - отрицательное, четвертая степень числа = %.2f \n", res3);
		} else {			
			System.out.println("Число "+c+" - ни положительное, ни отрицательное! Математических действий не требуется! \n");
		}
	}

}
