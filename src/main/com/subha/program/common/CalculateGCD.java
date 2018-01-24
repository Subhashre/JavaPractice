package main.com.subha.program.common;

public class CalculateGCD {

	public static void main(String[] args) {
		calGCD(13, 100);
		calGCD(75, 125);
		calGCD(81, 153);
		
		calGCDUsinfWhileLoop(13, 100);
		calGCDUsinfWhileLoop(75, 125);
		calGCDUsinfWhileLoop(81, 153);
		
		System.out.println(calGCDRecursion(81,153));
	}
	
	public static void calGCD(int n1 ,int n2) {
		int result = 0;
		for(int i = 1 ; i <= n1 && i <= n2 ;i++) {
			if( n1 % i == 0 && n2 % i == 0)
				result = i ;
		}
		System.out.printf("G.C.D of %d and %d is %d \n", n1, n2, result );
	}
	
	public static void calGCDUsinfWhileLoop(int n1 ,int n2) {

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }

        System.out.println("G.C.D of "+ n1 );
	}
	
	public static int calGCDRecursion(int n1 ,int n2) {
		if(n1 == n2)
			return n1;
		if(n1 > n2 )
			return calGCDRecursion(n1 - n2, n2);
		if(n1 < n2)
			return calGCDRecursion(n2-n1, n1);
		return 1;
	}

}
