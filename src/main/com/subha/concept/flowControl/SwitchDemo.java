package main.com.subha.concept.flowControl;

public class SwitchDemo {
	public static void main(String[] args) {
		String s ="";
		switch("x") {
		case "A":
			System.out.println("A");
			break;
			
		case "B":
			System.out.println("B");
			break;
		default :
			System.out.println("default");
		}
		
		switch(s+"A") {
		case "A":
			System.out.println("A");
			break;
			
		case "B":
			System.out.println("B");
			break;
		default :
			System.out.println("default");
		}
		
		do {
			
		}while(1>10);
		
		
	}
	
}
