package string;
import java.util.Scanner;  
public class twenty {
    public static void main(String[] args) {
        System.out.print("String: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char ch;
        int frq = 0;
        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            frq = count(s1,ch);
            System.out.println("charachter " + ch + " frequency " + frq);
        }
        sc.close();
    }

    private static int count(String s1, char ch) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(ch == s1.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
