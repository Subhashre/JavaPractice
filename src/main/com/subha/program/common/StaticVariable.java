package main.com.subha.program.common;

public class StaticVariable {
	static final int i=98;

	/*StaticVariable (){  // compilation Error
		i =34;
	}*/
	/*public void loadDataNonStatic() {
		i = 20;
	}

	public static void loadData() {
		i = 10;
	}*/

	public static void main(String[] args) {
		System.out.println(StaticVariable.i);
	}

	/*static {
		i=40;
	}*/
}
