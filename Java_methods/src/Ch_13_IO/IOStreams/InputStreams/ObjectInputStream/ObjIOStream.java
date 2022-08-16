package Ch_13_IO.IOStreams.InputStreams.ObjectInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjIOStream {
    public static void main(String[] args) {
        // data to be enter in file in object form
        int data1 = 15;
        String data2 = "Sachin Yadav";

        try {
            FileOutputStream file = new FileOutputStream("D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\InputStreams\\BufferedInputStream\\file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            // now writing into the file
            output.writeObject(data2);
            output.writeInt(data1);
            output.close();




            FileInputStream file2 = new FileInputStream("D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\InputStreams\\BufferedInputStream\\file.txt");
            ObjectInputStream input = new ObjectInputStream(file2);
            // reading data in object form
            System.out.println("Object data is: " + input.readObject());
            System.out.println("Object data is: " + input.readInt());

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
