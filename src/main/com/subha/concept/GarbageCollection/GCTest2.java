package main.com.subha.concept.GarbageCollection;

public class GCTest2 {
	public static void main(String[] args) throws InterruptedException
    {
		GCTest2 t = new GCTest2();
             
        // making t eligible for garbage collection
        t = null; 
             
        // calling garbage collector
        System.gc(); 
             
        // waiting for gc to complete
        Thread.sleep(1000); 
      
        System.out.println("end main");
    }
 
    @Override
    protected void finalize() 
    {
        System.out.println("finalize method called");
        System.out.println(10/0);
    }
}
