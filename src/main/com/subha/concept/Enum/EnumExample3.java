package main.com.subha.concept.Enum;

public class EnumExample3 {
	
	public static void main(String[] args) {
		Week2 day1 = Week2.Sunday;
		day1.enumMethod();
	}
}
enum Week2 { //extends Object -- compilation error --at most 1 class be extended(Enum)
	Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;
	public void enumMethod() {
		System.out.println("Method inside the enum : ");
		System.out.println(this);
	}
}