package conditional;

import java.util.Scanner;

class five {// class declaration

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
        String result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ? ch + " is an Alphabet" : ch + " is not an Alphabet";
        System.out.print(result);
        sc.close();
    }
}
