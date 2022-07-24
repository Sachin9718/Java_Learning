package string;

public class commandline {
    // Write the whole address of this file in terminal
    // and at the end write some string of your own choise 
    public static void main(String[] args) {
        System.out.println("This is a command line ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] -> " + args[i]);
        }
    }
}
