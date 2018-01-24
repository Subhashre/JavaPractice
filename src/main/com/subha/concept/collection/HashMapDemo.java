package main.com.subha.concept.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		EmployeeHashMap e1 = new EmployeeHashMap();
		
		e1.setFname("Pyasa");
		e1.setLname("Subudhi");
		EmployeeHashMap e2 = new EmployeeHashMap();
		
		e2.setLname("Sahu");
		e2.setFname("Barsha");
		Map<EmployeeHashMap, String> map = new HashMap<>();
		map.put(e1, "Employee1");
		map.put(e2, "Employee2");
		map.put(null, "Employee3");
		map.put(null, "Employee4");
		System.out.println("Hello");
		
		EmployeeHashMap e3 =new EmployeeHashMap();
		e3.setFname("Barsha");
		e3.setLname("Sahu");
		System.out.println( map.get(e3));

		
	}

}

class EmployeeHashMap extends Object{
	
	String Fname ;
	
	
	@Override
	public String toString() {
		return "EmployeeHashMap [Fname=" + Fname + ", Lname=" + Lname + "]";
	}

	String Lname;
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	@Override
	public int hashCode() {
		return 22 ;
	}
	
}
