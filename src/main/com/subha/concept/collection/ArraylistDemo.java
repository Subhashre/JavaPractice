package main.com.subha.concept.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArraylistDemo {

	public static void main(String[] args) {
//		Start :String List
		ArrayList<String> list = new ArrayList<String>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        System.out.println(list.size());     //Output : 3
        //Inserting some more elements
        list.add("FOUR");
        list.add("FIVE");
        System.out.println("The list is : "+list);  
        System.out.println(list.size());    //Output : 5
        //Removing an element
        list.remove("TWO");
        System.out.println("The list after removing an elemnt is : "+list);
        list.remove("Three");
        System.out.println("The list after removing an elemnt is : "+list);
        System.out.println(list.size()); 
//        End :String List
        
//        Start :Integer List
        
        ArrayList<Integer> listInteger = new ArrayList();     //ArrayList with integer
        listInteger.add(1);        //adding primitive int type
        listInteger.add(20);    //adding primitive double type
        listInteger.add(new Integer(23));   //Adding Float wrapper type object
        listInteger.add(new Integer(3));      //Adding Long wrapper type object
        System.out.println("The list is : "+listInteger); 
        listInteger.remove(3); //3 will be treated as object not index
        System.out.println("The list after removing an elemnt is : "+listInteger);
        
        
        System.out.println("///////////////////");
        String[] str={"ratan","Sravya","aruna"};
        List<String> al = Arrays.asList(str);
//        al.add("newperson-1");  // Exception in thread "main" java.lang.UnsupportedOperationException
//        al.add("newperson-2");   //Exception in thread "main" java.lang.UnsupportedOperationException
        //printing data by using enhanced for loop
        for (String s: al)
        { System.out.println(s);
        }
        
	}

}
