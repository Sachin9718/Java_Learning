package Ch_13_IO.IOStreams.OutputStreams.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferIO {
    public static void main(String[] args) {
        String data = "File is changed by sachin yadav believe me sach me bhai";
        try {
            FileOutputStream file = new FileOutputStream("D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\InputStreams\\BufferedInputStream\\file.txt");
            BufferedOutputStream output = new BufferedOutputStream(file);

            // byte[] array = data.getBytes();
            output.write(data.getBytes());

            output.close();
            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
