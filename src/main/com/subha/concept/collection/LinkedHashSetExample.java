package main.com.subha.concept.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

import javax.net.ssl.HandshakeCompletedEvent;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
        //Creating LinkedHashSet
 
        LinkedHashSet<String> set = new LinkedHashSet<String>();
 
        //Adding elements to LinkedHashSet
 
        set.add("JAVA");
 
        set.add("J2EE");
 
        set.add("STRUTS");
 
        set.add("JSP");
 
        set.add("JDBC");
 
        set.add("HIBERNATE");
 
        //Printing elements of LinkedHashSet
 
        System.out.println(set);     
 
        //Output : [JAVA, J2EE, STRUTS, JSP, JDBC, HIBERNATE]
 
        //Notice the order of elements. They are placed according to their insertion order.
        
        set.remove("JSP");
        //Printing elements of LinkedHashSet
        
        System.out.println(set);    
        
        
      //Creating LinkedHashSet
        
        LinkedHashSet<String> set1 = new LinkedHashSet<String>();
 
        //Adding elements to LinkedHashSet
 
        set1.add("JAVA");
 
        set1.add("J2EE");
 
        set1.add("STRUTS");
 
        set1.add("JSP");
 
        set1.add("JDBC");
 
        set1.add("HIBERNATE");
 
        //Getting Iterator object
 
        Iterator<String> it = set1.iterator();
 
        //Modifying the LinkedHashSet after the Iterator is created
 
//        set1.add("JSF"); -- This statement will throw ConcurrentModificationException
 
        while (it.hasNext())
        {
            //This statement will throw ConcurrentModificationException
 
            System.out.println(it.next());
        }
        
        
    }
}
