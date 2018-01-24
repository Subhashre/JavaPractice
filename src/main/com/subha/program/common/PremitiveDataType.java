package main.com.subha.program.common;

public class PremitiveDataType {

	public static void main(String[] args) {
		float f1 = 2.31228907f;
		System.out.println(f1);
		f1= (float) 2.311;
		System.out.println(f1);
		
		f1= -34f;
		System.out.println(f1);
		
		double d1= 23;
		System.out.println(d1);
		d1=-45;
		System.out.println(d1);
		d1=2.31228907;
		System.out.println(d1);
		char c1= 89;
//		 c1= -89; // not allowed
		System.out.println(c1);
		
		//unsigned
		
		/*unsigned int  f2 = 2.31228907;
		System.out.println(f1);
		f1= (float) 2.311;
		System.out.println(f1);*/
		
		
		long l1 = 12;
		System.out.println(l1);
		l1 = -12;
		System.out.println(l1);
	}

}
