package main.com.subha.concept.Enum;

public class EnumExample1 {
	public static void main(String[] args) {
		Week weekStarts = Week.Monday;
		System.out.println("Weeks starts on :" + weekStarts);
		Week[] days = Week.values();
		System.out.println("Days in a Weeks are:" );
		for(Week w : days) {
			System.out.println(w);
		}
			
	}
}

enum Week { //extends Object -- compilation error --at most 1 class be extended(Enum)
	Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;
}