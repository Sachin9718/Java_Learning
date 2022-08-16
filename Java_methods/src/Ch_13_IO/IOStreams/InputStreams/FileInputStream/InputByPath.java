package Ch_13_IO.IOStreams.InputStreams.FileInputStream;

import java.io.FileInputStream;

public class InputByPath {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream(
                "D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\InputStreams\\BufferedInputStream\\file.txt");
            System.out.println("Data in the file: ");

            // Reading file in byte
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);

                // read next byte
                i = input.read();
            }
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}