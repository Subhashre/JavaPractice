package main.com.subha.program.common;

public class FibonacciSeries {

	public static void main(String[] args) {

		int nElement =2;
		printNTHFibonacciNumber(nElement);
		 nElement =5;
		 printNTHFibonacciNumber(nElement);
		 nElement =1;
		 printNTHFibonacciNumber(nElement);
		 nElement =7;
		printNTHFibonacciNumber(nElement);
		System.out.println("Fibonacci Series starts:_________________________________");
		printFibonacciseries(2);
		printFibonacciseries(10);
		System.out.println("Fibonacci element using recursion starts:_________________________________");
		 nElement =2;
		 System.out.println(printNTHFibonacciNumberUsingRecursion(nElement));
		 nElement =5;
		 System.out.println(printNTHFibonacciNumberUsingRecursion(nElement));
		 nElement =1;
		 System.out.println(printNTHFibonacciNumberUsingRecursion(nElement));
		 nElement =7;
		 System.out.println(printNTHFibonacciNumberUsingRecursion(nElement));
	}

	private static void printNTHFibonacciNumber(int nElement) {
	
		if(nElement == 1)
			System.out.println("0");
		else if(nElement == 2)
			System.out.println("1");
		else {
			int i =0 ;
			int j=1;
			
			int temp =0;
			for(int x=3 ; x <= nElement ; x++) {
				temp = i+j ;
				i=j;
				j= temp;
			}
			System.out.println(temp);
		}
			
	}
	
	private static void printFibonacciseries(int nElement) {

		System.out.println("Fibonacci Series for "+nElement +" starts ---------------");
		if(nElement ==1)
			System.out.println("0");
		else if (nElement ==2)
			System.out.println("0\n1");
		else {
			int temp = 0;
			int i=0;
			int j= 1;
			System.out.println(i);
			System.out.println(j);
			for(int x = 3 ; x<=nElement ; x++) {
			temp = i+j;
			i=j;
			j=temp;
			System.out.println(temp);
			}
		}
	}
	
	public static int printNTHFibonacciNumberUsingRecursion(int nElemnet) {
		//System.out.println("Fibonacci Series for "+ nElemnet +" with recursion starts ---------------");
		if(nElemnet == 1)
			return 0;
		if(nElemnet ==2)
			return 1;
		else
			return printNTHFibonacciNumberUsingRecursion(nElemnet-1) + printNTHFibonacciNumberUsingRecursion(nElemnet-2);
	}
}
