package main.com.subha.program.common;

public class StaticInheritance {

	public static void main(String[] args) {
		Demo2 d2 = new Demo2() ;
		d2.method1();
		
		Demo2.method1();
		Demo1 d1 = new Demo2() ;
		d1.method1();
	}

}

class  Demo1{
	
	static void method1() {
		System.out.println("Static method of demo1");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside demo1");
	}
	
	//void method2(); 
}

class Demo2 extends Demo1{
	static void method1() {
		System.out.println("Static method of demo2");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside demo2");
	}
}