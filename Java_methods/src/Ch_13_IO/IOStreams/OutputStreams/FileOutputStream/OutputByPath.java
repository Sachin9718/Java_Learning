package Ch_13_IO.IOStreams.OutputStreams.FileOutputStream;
import java.io.FileOutputStream;
public class OutputByPath {
    public static void main(String[] args) {
        // Data in String form
        String data = "Hello Sachin how are you what are you doing I am doing nothing just having some fun";
        String data2 = "Hello My name is SinniS How are you";
        try {
            FileOutputStream output = new FileOutputStream("D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\OutputStreams\\FileOutputStream\\Output.txt");
            
            byte[] array = data.getBytes();  // converting string into bytes array
            
            output.write(array);
            
            output.close();

            
            FileOutputStream out = new FileOutputStream("D:\\Java_Learning\\Java_methods\\src\\Ch_13_IO\\IOStreams\\OutputStreams\\FileOutputStream\\Output.txt");
            out.write(data2.getBytes());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }   
}
