package string;

import java.util.Scanner;

public class one_seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // one
        System.out.print("Enter your name here - >");
        String name = sc.nextLine();
        System.out.println("Length of your name is " + name.length());

        // Two
        String s1 = "I am a web developer";
        s1 = name;
        System.out.println("Copying s1 into name -> " + s1);

        // Three
        String s2 = "My name is ";
        System.out.println("Concating two string:- " + s2.concat(name));

        // four
        String s3 = "Sachin Yadav";
        String s4 = "Sachin Yadav";
        System.out.println("Comparing two string:- " + s3.compareTo(s4));

        // five
        System.out.println("converting " + name + " to " + name.toUpperCase() );
        
        // Six
        System.out.println("converting " + name + " to " + name.toLowerCase() );

        // Seven
        togglecase();

        sc.close();
    }
    public static void togglecase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String to toggle it ");
        String s1 = sc.nextLine();
        String temp = "";
        for (int i = 0; i < s1.length(); i++) {
            if(Character.isUpperCase(s1.charAt(i))){
                temp += Character.toLowerCase(s1.charAt(i));
            }
            else if(Character.isLowerCase(s1.charAt(i)) ){
                temp += Character.toUpperCase(s1.charAt(i));
            }
            else{
                temp += s1.charAt(i);
            }
        }
        System.out.println("toggled string is ");
        System.out.println(temp);
        sc.close();
    }
}
