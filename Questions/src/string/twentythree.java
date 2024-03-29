package string;

import java.util.ArrayList;
import java.util.Scanner;

public class twentythree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string as an input");
        String input = scanner.nextLine();
        System.out.println("Enter a letter to be removes from the string");
        Character character = scanner.next().charAt(0);

        System.out.println("Our resultant string is: " + removeOccurences(input, character));
        scanner.close();
    }

    private static String removeOccurences(String input, Character character) {
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != character) {
                al.add(ch);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : al) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
