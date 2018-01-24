package main.com.subha.program.common;

public class FloatDeclaration {

	public static void main(String[] args) {
		
		float f1 = 0011;
		System.out.println(f1);
		float f2 = 3.14f;  //3.14 is not allowed
		System.out.println(f2);
		float f3 = -343;
		System.out.println(f3);
		float f4 = 0x12345;
		System.out.println(f4);
//		float f5 = 42e7;   -- not allowed cant convert from double to float
//		float f5 = 2001.0D; -- not allowed cant convert from double to float
		float f6 = 2.81F;
		System.out.println(f6);
		
		
	}
 
}
