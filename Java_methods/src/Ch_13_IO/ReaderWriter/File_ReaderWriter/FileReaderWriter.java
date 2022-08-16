package Ch_13_IO.ReaderWriter.File_ReaderWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {
    public static void main(String[] args) {
        char[] arr = new char[105];
        try {
            FileReader input = new FileReader(
                    "Java_methods\\src\\Ch_13_IO\\ReaderWriter\\File_ReaderWriter\\Reader.txt");
            input.read(arr);
            System.out.println(arr);
            System.out.println("Encoding is: " + input.getEncoding());
            input.close();

            FileWriter output = new FileWriter(
                    "Java_methods\\src\\Ch_13_IO\\ReaderWriter\\File_ReaderWriter\\writer.txt");
            output.write(arr);
            output.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
