package main.com.subha.concept.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class SerializationExam3 {

	public static void main(String[] args) throws Exception {
		BBB b1 = new BBB(10, 20);
        
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
        BBB b2 = (BBB)ois.readObject();
             
        // closing streams
        ois.close();
        fis.close();
             
        System.out.println("Object has been deserialized");
         
        System.out.println("i = " + b2.i);
        System.out.println("j = " + b2.j);
        
	}

}
class AAA implements Serializable
{
    int i;
     
    // parameterized constructor
    public AAA(int i) 
    {
        this.i = i;
    }
     
}
 
// subclass B 
// B class doesn't implement Serializable
// interface.
class BBB extends A
{
    int j;
     
    // parameterized constructor
    public BBB(int i,int j) 
    {
        super(i);
        this.j = j;
    }
     
    // By implementing writeObject method, 
    // we can prevent
    // subclass from serialization
    private void writeObject(ObjectOutputStream out) throws IOException
    {
        throw new NotSerializableException();
    }
     
    // By implementing readObject method, 
    // we can prevent
    // subclass from de-serialization
    private void readObject(ObjectInputStream in) throws IOException
    {
        throw new NotSerializableException();
    }
     
}