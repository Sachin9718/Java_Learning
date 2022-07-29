package SwitchCase;
import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        vowels(ch1);
        sc.close();
    }
    private static void vowels(char ch1) {
        switch (ch1) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U': {

                System.out.println(ch1 + " is a vowel");
                break;
            }
            default:
                System.out.println(ch1 + " is a consonant");
                break;
        }

    }
}
