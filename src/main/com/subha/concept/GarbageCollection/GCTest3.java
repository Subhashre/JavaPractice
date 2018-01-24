package main.com.subha.concept.GarbageCollection;

public class GCTest3 {

	static GCTest3 t;

	static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		GCTest3 t1 = new GCTest3();

		// making t1 eligible for garbage collection
		t1 = null; // line 12

		// calling garbage collector
		System.gc(); // line 15

		// waiting for gc to complete
		Thread.sleep(1000);

		// making t eligible for garbage collection,
		t = null; // line 21

		// calling garbage collector
		System.gc(); // line 24

		// waiting for gc to complete
		Thread.sleep(1000);

		System.out.println("finalize method called " + count + " times");

	}

	@Override
	protected void finalize() {
		count++;
		t = this; // line 38

	}
}

/*
 * After execution of line 12, t1 becomes eligible for garbage collection. So
 * when we call garbage collector at line 15, Garbage Collector will call
 * finalize() method on t1 before destroying it. But in finalize method, in line
 * 38, we are again referencing the same object by t, so after execution of line
 * 38,this object is no longer eligible for garbage collection. Hence, Garbage
 * Collector will not destroy the object.
 * 
 * Now again in line 21, we are making same object eligible for garbage
 * collection one more time. Here, we have to clear about one fact about Garbage
 * Collector i.e. it will call finalize() method on a particular object exactly
 * one time. Since on this object, finalize() method is already called, so now
 * Garbage Collector will destroy it without calling finalize() method again.
 */
