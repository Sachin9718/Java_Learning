package string;

public class thiryeight {
    public static void main(String[] args) {

        String str1 = "Remove all extra    spaces";

        // Removes the white spaces using regex
        str1 = str1.replaceAll("\\s+", " ");

        System.out.println("String after removing all the spaces : " + str1);
    }
}
