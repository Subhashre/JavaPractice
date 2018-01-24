package main.com.subha.concept.Enum;

public class EnumExample2 {

	public static void main(String[] args) {
		Week1 week1 = Week1.Friday; // constructor will be called the no of times the no of elements present in the enum
		System.out.println("My favorite day in a week is : " + week1 );
	}

}

enum Week1 { //extends Object -- compilation error --at most 1 class be extended(Enum)
	Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;
	 Week1(){
		 System.out.println("Enum Constructor called at the time of loading :");
		 System.out.println(this);
	}
}