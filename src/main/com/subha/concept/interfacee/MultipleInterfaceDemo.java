package main.com.subha.concept.interfacee;

public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		child c = new child();
		c.method1();
	}

}
interface I1{
	void method1();
}
interface I2{
	void method1();
}
class child implements I1,I2{

	public void method1() {
		System.out.println("Inside child class method1");		
	}
	
}