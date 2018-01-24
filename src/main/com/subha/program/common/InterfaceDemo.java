package main.com.subha.program.common;

interface I1{
	String s ="string";
}
public class InterfaceDemo implements I1{
	
	public static void main(String[] args) {
		InterfaceDemo d1= new InterfaceDemo();
		
		System.out.println(s);
		System.out.println(I1.s);
		System.out.println(d1.s);
	}
}
