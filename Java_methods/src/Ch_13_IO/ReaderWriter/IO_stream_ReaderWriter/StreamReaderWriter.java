package Ch_13_IO.ReaderWriter.IO_stream_ReaderWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamReaderWriter {
    public static void main(String[] args) {
        // Array of size 100 for input
        char[] array = new char[100];

        try {
            FileInputStream file = new FileInputStream(
                    "Java_methods\\src\\Ch_13_IO\\ReaderWriter\\IO_stream_ReaderWriter\\Rederfile.txt");
            InputStreamReader input = new InputStreamReader(file);

            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            System.out.println("Encoding of this file " + input.getEncoding());
            input.close();

            FileOutputStream file2 = new FileOutputStream(
                    "Java_methods\\src\\Ch_13_IO\\ReaderWriter\\IO_stream_ReaderWriter\\writer.txt");
            OutputStreamWriter output = new OutputStreamWriter(file2);

            output.write(array);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
