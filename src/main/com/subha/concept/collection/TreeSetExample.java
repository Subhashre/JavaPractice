package main.com.subha.concept.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        //Creating a TreeSet without supplying any Comparator
 
        TreeSet<Integer> set = new TreeSet<Integer>();
 
        //Adding elements to TreeSet
 
        set.add(23);      
 
        set.add(11);    
 
        set.add(41);      
 
        set.add(7);
 
        set.add(69);
 
        set.add(18);
 
        set.add(38);
 
        //printing elements of TreeSet
 
        System.out.println(set);      //Output : [7, 11, 18, 23, 38, 41, 69]
        
        Student2 s = new Student2();
        TreeSet<Student2> set2 = new TreeSet<Student2>(s);
        
        set2.add(new Student2(121, "Santosh", 85));
        
        set2.add(new Student2(231, "Cherry", 71));
         
        set2.add(new Student2(417, "David", 82));
         
        set2.add(new Student2(562, "Praveen", 91));
         
        set2.add(new Student2(231, "Raj", 61));         //Duplicate element
         
        set2.add(new Student2(458, "John", 76));
         
        set2.add(new Student2(874, "Peter", 83));
         
        set2.add(new Student2(231, "Hari", 52));       //Duplicate element
         
        set2.add(new Student2(568, "Daniel", 89));
        System.out.println(set2);
        System.out.println(set2.size());
        
    }
}

class Student2 implements Comparator
{
    int id;
 
    String name;
 
    int perc_Of_Marks_Obtained;
 
    public Student2()
    {
    }
    public Student2(int id, String name, int perc_Of_Marks_Obtained)
    {
        this.id = id;
 
        this.name = name;
 
        this.perc_Of_Marks_Obtained = perc_Of_Marks_Obtained;
    }
 
    @Override
    public String toString()
    {
        return id+" : "+name+" : "+perc_Of_Marks_Obtained ;
    }

	@Override
	public int compare(Object o1, Object o2) {
		Student2 s1 = (Student2)o1;
		Student2 s2 = (Student2)o2;
		if (s1.id == s2.id)
			return 0;
		return s1.perc_Of_Marks_Obtained - s2.perc_Of_Marks_Obtained;
	}
}

//Important Note : TreeSet doesn’t use hashCode() and equals() methods to compare it’s elements. 
//It uses compare() (or compareTo()) method to determine the equality of two elements. 
//Therefore, I have kept the code which compares two Student objects based on their id in compare method itself. 
//This removes possible duplicate elements (elements having same id) from the TreeSet.
