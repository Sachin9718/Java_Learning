package string;

public class thitytwo {
    static void remove(String str, String word) {
        String msg[] = str.split(" ");
        String new_str = "";
        boolean flag = true;
        for (String words : msg) {

            if (words.equals(word) && flag) {
                flag = false;
            } else {
                new_str += words + " ";
            }
        }

        System.out.print(new_str);
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "hello i hello am  hello sukhvindra";

        String word = "hello";

        remove(str, word);
    }
}
