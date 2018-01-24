package main.com.subha.program.common;

public class FactorialOfNumber {

	public static void main(String[] args) {
		factorialOfNumber(5);
		factorialOfNumber(6);
		factorialOfNumber(3);
		
		System.out.println("Factorial of number using recursion starts----------------------");
		System.out.println(factorialOfNumberUsingRecursion(5));
		System.out.println(factorialOfNumberUsingRecursion(6));
		System.out.println(factorialOfNumberUsingRecursion(3));
	}
	public static void factorialOfNumber(int no) {
		int mul = 1;
		int number = no;
		while(no>0) {
			mul *= no;
			no -= 1;
		}
		System.out.println("Factorial of "+ number + " is :" + mul );	

	}
	
	public static int factorialOfNumberUsingRecursion(int no) {
		if(no>0)
			return no*factorialOfNumberUsingRecursion(no-1);
		else
			return 1;
	}
}
