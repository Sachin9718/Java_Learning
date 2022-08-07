package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class excepHand {
    public static void main(String[] args) {
        FileReader read = null;
        try {
            read = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println("Here we have two exceptions");
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
