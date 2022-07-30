package string;
import java.util.Scanner;
public class eight_nine {
    public static void main(String[] args) {

        System.out.println("Enter your string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int digi = 0;
        int chari = 0;
        int specChari = 0;
        int vowels = 0;
        int consonents = 0;
        for (int i = 0; i < s1.length(); i++) {

            if (Character.isDigit(s1.charAt(i))) {
                digi++;
            } else if ((s1.charAt(i) >= 65 && s1.charAt(i) <= 90) || (s1.charAt(i) >= 97 && s1.charAt(i) <= 122)) {
                chari++;
                if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                    vowels++;
                } else {
                    consonents++;
                }
            } else if ((s1.charAt(i) >= 33 && s1.charAt(i) <= 47) || (s1.charAt(i) >= 58 && s1.charAt(i) <= 64)) {
                specChari++;
            }
        }

        System.out.println(
                "In this string: Characters: " + chari + ", Digits: " + digi + ", Special Characters: " + specChari);
        System.out.println("In this string: vowels: " + vowels + " consonants: " + consonents);

        sc.close();
    }

}
