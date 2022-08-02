package string;

import java.util.LinkedHashSet;

public class twentyfour {
    static void removeDuplicates(String str) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++)
            set.add(str.charAt(i));

        for (Character ch : set)
            System.out.print(ch);
    }

    // main() method start
    public static void main(String args[]) {

        String str = "hello my name is sukhvindra singh";

        removeDuplicates(str);
    }
}
