package main.com.subha.program.common;

public class OutputProgram {

	public static void main(String[] args) {
		OutputProgram p = new OutputProgram();
		p.start();
		System.out.println("////////////////");
		int x = 0x80000000;
		System.out.print(x + " and  ");
		x = x >>> 31;
		System.out.println(x);

		/*
		 * The >>> operator moves all bits to the right, zero filling the left bits. The
		 * bit transformation looks like this:
		 * 
		 * Before: 1000 0000 0000 0000 0000 0000 0000 0000
		 * 
		 * After: 0000 0000 0000 0000 0000 0000 0000 0001
		 */

		System.out.println("////////////////");
		int x1 = 20;
		String sup = (x1 < 15) ? "small" : (x1 < 22) ? "tiny" : "huge";
		System.out.println(sup);
		System.out.println("////////////////");
		printNo();
		System.out.println("////////////////");
		bitWise();
		System.out.println("////////////////");
		booleanCheck();
	}

	void start() {
		String s1 = "slip";
		String s2 = fix(s1);
		System.out.println(s1 + " " + s2);
	}

	String fix(String s1) {
		s1 = s1 + "stream";
		System.out.print(s1 + " ");
		return "stream";
	}

	static void printNo() {
		int x = 0;
		int y = 0;
		for (int z = 0; z < 5; z++) {
			if ((++x > 2) && (++y > 2)) {
				x++;
			}
		}
		System.out.println(x + " " + y);
		System.out.println("////////////////");
		x = 0;
		y = 0;
		for (int z = 0; z < 5; z++) {
			if ((++x > 2) || (++y > 2)) {
				x++;
			}
		}
		System.out.println(x + " " + y);
	}

	static void bitWise() {
		int x = 11 & 9;
		System.out.println(x);
		int y = x ^ 3;
		System.out.println(y);
		System.out.println(y | 12);
	}

	static void booleanCheck() {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		if (b1 & b2 | b2 & b3 | b2) /* Line 8 */
			System.out.print("ok ");
		if (b1 & b2 | b2 & b3 | b2 | b1) /* Line 10 */
			System.out.println("dokey");
	}
}
