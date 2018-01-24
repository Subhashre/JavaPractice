package main.com.subha.concept.thread.synchronization;

class SharedClass
{
    int i;
 
    synchronized void SharedMethod()
    {
        Thread t = Thread.currentThread();
 
        for(i = 0; i <= 10; i++)
        {
            System.out.println(t.getName()+" : "+i);
        }
    }
}
 
public class SynchronizationMethod
{
    public static void main(String[] args)
    {
        final SharedClass s1 = new SharedClass();
 
        Thread t1 = new Thread("Thread - 1")
        {
            @Override
            public void run()
            {
                s1.SharedMethod();
            }
        };
 
        Thread t2 = new Thread("Thread - 2")
        {
            @Override
            public void run()
            {
                s1.SharedMethod();
            }
        };
 
        t1.start();
 
        t2.start();
    }
}