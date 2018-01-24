package main.com.subha.concept.thread.synchronization;

class SynchronizationInJava {

	/*
	    synchronized int i;    //compile time error, can't use synchronized keyword with variables
	 
	    synchronized public SynchronizationInJava()
	    {
	        //compile time error, constructors can not be synchronized
	    }
	 
	    synchronized static
	    {
	        //Compile time error, Static initializer can not be synchronized
	    }
	 
	    synchronized
	    {
	        //Compile time error, Instance initializer can not be synchronized
	    }
	    */
	
	public SynchronizationInJava()
    {
        synchronized (this)
        {
            //synchronized block inside a constructor
        	System.out.println("inside constructor.");
        }
    }
 
    static
    {
        synchronized (Shared.class)
        {
            //synchronized block inside a static initializer
        	System.out.println("inside static initializer.");
        }
    }
 
    {
        synchronized (this)
        {
        	//synchronized block inside a non-static initializer
           System.out.println("inside non static initializer.");
        }
    }
    synchronized static void staticMethod()
    {
        //static synchronized method
    	System.out.println("inside static synchronized method.");
    }
 
    synchronized void NonStaticMethod()
    {
        //Non-static Synchronized method
    	System.out.println("inside Non-static synchronized method.");
    }
    
    static void staticMethod1()
    {
        synchronized (Shared.class)
        {
            //static synchronized block - 1
        	System.out.println("inside synchronized block inside static method.");
        }
 
        synchronized (Shared.class)
        {
            //static synchronized block - 2
        	System.out.println("inside synchronized block inside static method.");
        }
    }
 
    void NonStaticMethod1()
    {
        synchronized (this)
        {
            //Non-static Synchronized block - 1
        	System.out.println("inside synchronized block inside non-static method.");
        }
 
        synchronized (this)
        {
            //Non-static Synchronized block - 2
        	System.out.println("inside synchronized block inside non-static method.");
        }
    }
    
}

public class Shared
{
    public static void main(String[] args)
    {
//        final SynchronizationInJava s1 = new SynchronizationInJava();
 
        Thread t1 = new Thread("Thread - 1")
        {
            @Override
            public void run()
            {
            	final SynchronizationInJava s1 = new SynchronizationInJava();
                s1.NonStaticMethod();
                s1.NonStaticMethod1();
            }
        };
 
        Thread t2 = new Thread("Thread - 2")
        {
            @Override
            public void run()
            {
            	final SynchronizationInJava s1 = new SynchronizationInJava();
            	   s1.NonStaticMethod();
                   s1.NonStaticMethod1();
            }
        };
 
        t1.start();
 
        t2.start();
    }
}
