package main.com.subha.program.common;

public class MethodOverloading {
	public void print(String s) {
		System.out.println("String");
	}

	public void print(Object s) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.print(null);
	}
}
