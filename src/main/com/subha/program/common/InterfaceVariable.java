package main.com.subha.program.common;

public class InterfaceVariable implements I{

	public static void main(String[] args) {
		System.out.println(InterfaceVariable.i);
		System.out.println(I.i);
		System.out.println(new InterfaceVariable().i);
	}

}
interface I{
	int i = 10;
	
	//static void methoda(double d1); -- not allowed
}