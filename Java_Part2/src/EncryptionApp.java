package src;

import java.util.*;

public class EncryptionApp {
    private Scanner scanner;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private char[] letters;

    EncryptionApp() {
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        shuffledList = new ArrayList<>();
        character = ' ';

        askQuestion();
    }

    private void askQuestion() {
        while (true) {

            System.out.println("\n\nWelcome to Encryption Program");
            System.out.println("What I can do for you");
            System.out.println("To select a task, Press any key from below");
            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit");

            char response = Character.toUpperCase(scanner.nextLine().charAt(0));
            switch (response) {
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Key is not valid :( ");
                    break;
            }
        }

    }

    private void newKey() {
        character = ' ';
        list.clear();
        shuffledList.clear();

        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }

        shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("** A new key is generated **");

    }

    private void getKey() {
        System.out.println("Key: ");

        for (Character x : list) {
            System.out.print(x);
        }
        System.out.println("\n");
        for (Character x : shuffledList) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void encrypt() {
        System.out.print("Enter your message for Encryption: ");
        String message = scanner.nextLine();
        letters = message.toCharArray();

        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }

        System.out.println("Your message is Encrypted: ");
        for (char x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void decrypt() {
        System.out.println("Your message is Decrypted: ");
        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < shuffledList.size(); j++) {
                if (letters[i] == shuffledList.get(j)) {
                    letters[i] = list.get(j);
                    break;
                }
            }
        }
        for (char x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void quit() {
        System.out.println("Thanku for using our service");
        System.exit(0);
    }

    // Main method
    public static void main(String[] args) throws Exception {
        new EncryptionApp();
    }
}
