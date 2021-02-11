package serialisasi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.management.ObjectName;

public class Test {
    public static void main(String[] args) {
        Serialisasi object = new Serialisasi(1, "geeksforgeeks");
        String filename = "file.ser";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch (IOException ex) {

            System.out.println("IOException is caught");
        }

        Serialisasi object1 = null;

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object1 = (Serialisasi) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deseriarlized");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);

        } catch (IOException ex) {

            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
