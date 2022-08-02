package string;

import java.util.ArrayList;
import java.util.List;

public class thirty {
    public static void main(String args[]) {
        String string = "Spring is beautiful but so is winter";
        String word = "is";
        String temp[] = string.split(" ");
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
                count.add(i);
        }
        System.out.println("The string is: " + string);
        System.out.println("The word " + word + " occurs " + count + " in these positions");
    }
}
