package Ch_13_IO.IOStreams.InputStreams.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferIO {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\InputStreams\\BufferedInputStream\\file.txt");
            BufferedInputStream input = new BufferedInputStream(file);

            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
