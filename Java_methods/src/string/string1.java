package string;

public class string1 {

    public static void main(String[] args) {
        String str1 = "Sachin";
        String str2 = "Yadav";
        String str3 = "Sachin";
        System.out.println(str1 + " " + str2);

        System.out.println("The length of str1 is -> " + str1.length());
        System.out.println("The charachter of str2 3rd index -> " + str2.charAt(3));

        if (str1.equals(str2)) {
            System.out.println("The str1 and str2 are equals");
        } else if (str1.equals(str3)) {
            System.out.println("The str1 and str3 are equals");
        }
    }
}
