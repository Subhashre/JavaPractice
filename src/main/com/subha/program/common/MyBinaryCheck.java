package main.com.subha.program.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyBinaryCheck {
	public boolean isBinaryNumber(int binary){
        
        boolean status = true;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                if(tmp > 1){
                    status = false;
                    break;
                }
                binary = binary/10;
            }
        }
        return status;
    }
     
    public static void main(String a[]){
        MyBinaryCheck mbc = new MyBinaryCheck();
        System.out.println("Is 1000111 binary? :"+mbc.isBinaryNumber(1000111));
        System.out.println("Is 10300111 binary? :"+mbc.isBinaryNumber(10300111));
        System.out.println("Using RegEX");
        System.out.println("Is 1000111 binary? :"+mbc.isBinaryNumberUsingRegEx(1000111));
        System.out.println("Is 10300111 binary? :"+mbc.isBinaryNumberUsingRegEx(10300111));
        
    }

	private boolean isBinaryNumberUsingRegEx(int i) {
		Pattern p = Pattern.compile("[^2-9]");
		Matcher m = p.matcher(String.valueOf(i));
		if(m.find())
			return true;
		else
			return false;
	}
}
