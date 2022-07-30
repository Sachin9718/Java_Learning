package string;
import java.util.Scanner;
public class ten {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String s1 = sc.nextLine();
        char temp;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            temp = s1.charAt(i);
            if(temp == ' ' || temp == '\t'){
                count++;
            }
        }
        System.out.println("Total words are: " + count);
        sc.close();
    }
}
