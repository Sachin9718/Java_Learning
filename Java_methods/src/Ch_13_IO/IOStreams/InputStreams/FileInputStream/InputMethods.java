package Ch_13_IO.IOStreams.InputStreams.FileInputStream;

import java.io.FileInputStream;

public class InputMethods {
    public static void main(String[] args) {
        // available() method
        try {
            FileInputStream input = new FileInputStream(
                "D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\InputStreams\\BufferedInputStream\\file.txt");

            System.out.println("Available bytes before reading: " + input.available());

            // skip() method -> skips some places
            input.skip(15);
            System.out.println("\n\nAfter skipping 5 bytes available bytes are: " + input.available());

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
