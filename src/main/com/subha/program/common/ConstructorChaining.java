package main.com.subha.program.common;

public class ConstructorChaining {

	public static void main(String[] args) {
		C c = new C();
		A a = new C();
	}

}

class A{
	A(int i){
		System.out.println("Inside A class");
	}
}
class B extends A{
	B(){
		super(1);//else compilation issue
		System.out.println("Inside B class");
	}
}

class C extends B{
	C(){
		System.out.println("Inside C class");
	}
}

/*Output:
	Inside A class
	Inside B class
	Inside C class
	Inside A class
	Inside B class
	Inside C class
*/