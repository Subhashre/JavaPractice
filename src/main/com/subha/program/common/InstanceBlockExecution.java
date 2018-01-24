package main.com.subha.program.common;

import java.io.FileNotFoundException;

public class InstanceBlockExecution extends Test{
	
	int val ;
	
	public static void main(String[] args) {
		Test o1 = new Test();
		Test o2 = new InstanceBlockExecution();
		System.out.println(o1 instanceof InstanceBlockExecution);
		System.out.println(o1 instanceof Test);
		System.out.println(o2 instanceof InstanceBlockExecution);
		System.out.println(o2 instanceof Test);
//		System.out.println(o2 instanceof test); 
		System.out.println("Inside main method" + new InstanceBlockExecution().val);
		/*String name = "Barsha";   java.lang.StringIndexOutOfBoundsException: String index out of range: 10
		System.out.println(name.substring(2,10));*/
		try {
			throw new RuntimeException();
		} catch (NullPointerException | ArithmeticException  e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Character character = 'c' ;
		Character c1 = new Character(value)
	}
	static{
		System.out.println("Inisde InstanceBlockExecution static block");
	}
	{
//		val = 10;
		System.out.println("Inisde InstanceBlockExecution non static block");
	}
}

class Test{
	int i ;
	{
		i=50;
		System.out.println("Inisde test class non static block");
	}
	static{
		System.out.println("Inisde test class static block");
	}
}
class test extends AAA{
	
}
abstract class  AAA{
	AAA(){
		System.out.println("AA constructor");
	}
	
}