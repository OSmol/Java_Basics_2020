package by.ld.unit01.main;


public class Task06 {
	/*
	 * 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, 
	 * если в каждом большом бидоне на 12 л. больше, чем в малом? 
	 */

	public static void main(String[] args) {
	  int  n, m;
	  double bigCansSum=0;	
	  
	  n=15;
	  m=3;
	 
	  bigCansSum=m*(80/n+12);
	   
	  
	  System.out.println("Объем молока в "+m+" больших бидонах: "+bigCansSum);
	}
	  
}
