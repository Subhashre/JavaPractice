package main.com.subha.concept.designPattern;

import java.io.Serializable;

public class SingletonDemo {
	int val ;
	/*SingletonDemo(int val){
//		super();
		val = val; 
		
	}*/
	
	/*{
		System.out.println("non Static block of SingletonDemo");
	}*/
	public static void main(String[] args) {
		System.out.println("main of SingletonDemo" + new SingletonDemo().val);
		/*try {
			Singleton singleton = Singleton.getInstance();
		    Class<Singleton> singletonClass = (Class<Singleton>) Class.forName("main.com.subha.concept.designPattern.Singleton");
		    Constructor<?>[] constructors = singletonClass.getConstructors();
		
			Singleton singletonReflection = singletonClass.newInstance();
			boolean flag = singleton == singletonReflection;
			System.out.println("both objects are equal ??" + flag );
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		} catch (InstantiationException e) {
		    e.printStackTrace();
		} catch (IllegalAccessException e) {
		    e.printStackTrace();
		}*/
		
		/*if(i>10) {
			
		} can not find the symbol */
		
	}
	static {
		System.out.println("Static block of SingletonDemo");
	}
	{
		val =10;
		System.out.println("non static of singletonDemo");
	}

}

class Singleton implements Serializable {

	private static final long serialVersionUID = 3119105548371608200L;
	private static final Singleton singleton = new Singleton();

	private Singleton() {
//		if(singleton != null)
//			throw
	}

	public static Singleton getInstance() {
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning of this class is not allowed");
	}

	protected Object readResolve() {
			return singleton;
		
	}

//	public Object newInstance() throws InstantiationException {
//		throw new InstantiationError("Creating of this object is not allowed.");
//	}
	
//	public static void main(String[] args) {
//		System.out.println("main method");
//	}

}