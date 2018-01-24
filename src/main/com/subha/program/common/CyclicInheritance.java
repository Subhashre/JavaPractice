package main.com.subha.program.common;

public abstract class CyclicInheritance {

	public static void main(String[] args) {
		ab abb = new ab();
		System.out.println(abb.val);
		
		ac abbb = new ab();
		System.out.println(abbb.val);
		
		ad abbbb = new ab();
		abbbb.m4();
	}

}

class ab extends ac {
	
	int val =87 ;
	public void m1() {
		this.m2();
		super.m3();
		
	}
	
	public void m2() {
		this.m2();
	}
//	public abstract void m3();  not possible
}

class ac extends ad{
	int val =50;
	public void m3(){
		
	}
	@Override
	public void m4() {
		System.out.println(val);
	}
}

abstract class ad{
public abstract void m4();
}