package main.com.subha.program.common;

public class ExceptionOutput {

	public static void main(String[] args) {

		System.out.println(doit());
		System.out.println(doit1());
		
		// C1 c = new C1();
		// c.m1();

		/*
		 * try { return; } finally { System.out.println( "Finally" ); }
		 */

	}

	@SuppressWarnings("finally")
	private static int doit() {
		try {
			System.out.println("Inside try block");
			return 1;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finnaly block");
			return 2;
		}
	}
	
	@SuppressWarnings("finally")
	private static int doit1() {
		int i =10;
		try {
			System.out.println("Inside try block");
			return i;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finnaly block");
			return ++i;
		}
	}

}

class C1 {
	public void m1() {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
		}
		// catch (Error ex)
		// {
		// System.out.print("B");
		// }
		finally {
			System.out.println("C");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		throw new Error(); /* Line 22 */
	}
}

/*
 * Note:
 * 
 * When catching exceptions the more specific exceptions must be listed before
 * the more general (the subclasses must be caught before the superclasses).
 * 
 * Exception is not a superclass of Error.So unable to handle to catch block
 * 
 *
 */
