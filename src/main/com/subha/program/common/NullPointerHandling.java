package main.com.subha.program.common;

public class NullPointerHandling {

	
	public static void main(String[] args) {
		try {
			String arr[] = new String[3] ;	
			arr[0] = "ABC";
			arr[1] = "xyz";
			arr[2] = null ;	
			for(String s: arr)
				System.out.println(s.substring(1));
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
	}
	
	
}
