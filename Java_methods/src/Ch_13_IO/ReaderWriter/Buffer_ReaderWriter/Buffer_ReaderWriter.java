package Ch_13_IO.ReaderWriter.Buffer_ReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffer_ReaderWriter {
    public static void main(String[] args) {
        char[] arr = new char[160];
        try {
            FileReader file = new FileReader(
                    "Java_methods\\src\\Ch_13_IO\\ReaderWriter\\Buffer_ReaderWriter\\Reader.txt");
            BufferedReader input = new BufferedReader(file);
            input.read(arr);
            System.out.println(arr);
            input.close();

            FileWriter file2 = new FileWriter(
                    "Java_methods\\src\\Ch_13_IO\\ReaderWriter\\Buffer_ReaderWriter\\writer.txt");
            BufferedWriter output = new BufferedWriter(file2);
            output.write(arr);
            output.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
