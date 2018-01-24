package main.com.subha.concept.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExam2 {

	public static void main(String[] args) throws Exception {
		 BB b1 = new BB(10,20);
         
	        System.out.println("i = " + b1.i);
	        System.out.println("j = " + b1.j);
	         
	        // Serializing B's(subclass) object 
	         
	        //Saving of object in a file
	        FileOutputStream fos = new FileOutputStream("abc.ser");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	             
	        // Method for serialization of B's class object
	        oos.writeObject(b1);
	             
	        // closing streams
	        oos.close();
	        fos.close();
	             
	        System.out.println("Object has been serialized");
	         
	        // De-Serializing B's(subclass) object 
	         
	        // Reading the object from a file
	        FileInputStream fis = new FileInputStream("abc.ser");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	             
	        // Method for de-serialization of B's class object
	        BB b2 = (BB)ois.readObject();
	             
	        // closing streams
	        ois.close();
	        fis.close();
	             
	        System.out.println("Object has been deserialized");
	         
	        System.out.println("i = " + b2.i);
	        System.out.println("j = " + b2.j);
	    }
	}


class AA 
{
    int i;
     
    // parameterized constructor
    public AA(int i) 
    {
        this.i = i;
    }
     
    // default constructor
    // this constructor must be present
    // otherwise we will get runtime exception
    public AA()
    {
        i = 50;
        System.out.println("A's class constructor called");
    }
     
}
 
// subclass B 
// implementing Serializable interface
class BB extends AA implements Serializable
{
    int j;
     
    // parameterized constructor
    public BB(int i,int j) 
    {
        super(i);
        this.j = j;
    }
}
