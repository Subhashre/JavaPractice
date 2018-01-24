package main.com.subha.concept.reflexion;

public class ReflexionSample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			Class class1 = Class.forName("main.com.subha.concept.reflexion.Sample");
			System.out.println(class1.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class Sample{
	void printMessage() {
		System.out.println("Inside non static method of Sample");
	}
}