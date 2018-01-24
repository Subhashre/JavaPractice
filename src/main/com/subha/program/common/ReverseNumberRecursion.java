package main.com.subha.program.common;

public class ReverseNumberRecursion {

	public static void main(String[] args) {
		ReverseNumberRecursion nr = new ReverseNumberRecursion();
	        System.out.println("Result: "+nr.reverseNumber(17868,0));
	}

	private int reverseNumber(int i,int sum) {
		int sum1 = sum ;
		while(i > 0)
		return reverseNumber(i/10,(sum1*10+i%10));
		return sum1;
	}

	public int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
    }
}
