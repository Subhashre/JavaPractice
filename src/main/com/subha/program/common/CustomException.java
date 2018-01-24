package main.com.subha.program.common;

public class CustomException extends Exception{
	
	public CustomException() {
		
	}
	
	public CustomException(String s) {
		super(s);
	}
	
	public static void main(String[] args) throws CustomException {
		AA aa= new AA();
		aa.message1();
	}
}

class AA{
	public void message1 () throws CustomException { //throws CustomException
	
			System.out.println("Inside message1");
			throw new CustomException();
		
		
	}
}