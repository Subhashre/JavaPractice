package main.com.subha.concept.interfacee;

public class MultiPleInterface {
	public static void main(String[] args) {
		A a = new A();
		a.printNo();
		
		a = null;
		System.out.println(a.val);
		System.out.println(a.val1); // null pointer exception
	}
	
}

interface Iii1{
	int i =10;
}
interface Iii2{
	int i =16;
}
class A implements Iii1,Iii2{
	
	static int val =10;
	int val1 =10;
	public void printNo() {
//		System.out.println(Iii1.i); //ambiguity
		System.out.println(Iii1.i);
		System.out.println(Iii2.i);
	}
}