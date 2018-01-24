package main.com.subha.program.common;

public class LangMethods {

	public static void main(String[] args) {
		Double d = Math.floor(Math.random());
		System.out.println(d);
		d = Math.ceil(Math.random());
		System.out.println(d);
		
		Long l = Math.round( 2.5 + Math.random() );
		System.out.println(l);
		
		int a = Math.abs(-5);
		/* Compilation Fail
		 * 
		 * int b = Math.abs(5.0);
		int c = Math.abs(5.5F);
		int d = Math.abs(5L);  */
		System.out.println(a);
		
		System.out.println("/////////////////////");
		double values[] = {-2.3, -1.0, 0.25, 4};
        int cnt = 0;
        for (int x=0; x < values.length; x++) 
        {
            if (Math.round(values[x] + .5) == Math.ceil(values[x])) 
            {
                ++cnt;
            }
        }
        System.out.println("same results " + cnt + " time(s)");
        System.out.println("/////////////////////");
        System.out.println(Math.round(-2.3));
        System.out.println(Math.round(-2.6));
        System.out.println("/////////////////////");
        System.out.println(Math.ceil(-2.3));
        System.out.println(Math.ceil(-2.5));
        System.out.println("/////////////////////");
        System.out.println(Math.floor(-2.3));
        System.out.println(Math.floor(-2.5));
	}

}
