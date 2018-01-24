package main.com.subha.concept.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample
{
    public static void main(String[] args)
    {
        //Creating HashSet object
 
        HashSet<String> set = new HashSet<String>();
 
        //Adding elements to HashSet
 
        set.add("JAVA");
 
        set.add("JSP");
 
        set.add("STRUTS");
 
        set.add("HIBERNATE");
 
        set.add("JSP");
        System.out.println(set); 
 
        set.add("JAVA");          //[JAVA, HIBERNATE, JSP, STRUTS]
 
        //Printing the elements of HashSet
 
        System.out.println(set);     //Output : [JAVA, HIBERNATE, JSP, STRUTS]
 
        //You can notice that duplicate elements are not added to HashSet
        
        //Adding 3 null elements to hashSet
        
        set.add(null);
 
        set.add(null);
 
        set.add(null);
 
        //Printing the elements of HashSet
 
        System.out.println(set);     //Output :[JAVA, null, HIBERNATE, JSP, STRUTS]
 
        //You can notice that HashSet contains only one null element
        
      //getting synchronized set
        
        Set<String> syncSet = Collections.synchronizedSet(set);
        
        System.out.println(syncSet);
    }
}
