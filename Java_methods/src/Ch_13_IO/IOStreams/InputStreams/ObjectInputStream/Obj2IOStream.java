package Ch_13_IO.IOStreams.InputStreams.ObjectInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Obj2IOStream {
    public static void main(String[] args) {
        // Creating an Dog object
        dog dog1 = new dog("Tyson", "Labrador");

        try {
            FileOutputStream file = new FileOutputStream("D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\InputStreams\\BufferedInputStream\\file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(dog1);
            output.close();


            FileInputStream file2 = new FileInputStream("D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\InputStreams\\BufferedInputStream\\file.txt");
            ObjectInputStream input = new ObjectInputStream(file2);
            dog newdog = (dog) input.readObject();

            System.out.println(newdog.breed);
            System.out.println(newdog.name);

            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
