package src.SwingApp;

import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        // Create a new JFrame Container
        JFrame Jfr = new JFrame("A simple Swing Application");

        // Giving the size of JFrme
        Jfr.setSize(350, 100);

        // Terminate the progrma at user choise
        Jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crete a label
        JLabel txt = new JLabel("Swing is very powerful GUI tool\nMy name is SACHIN YADAV");

        // adding the label to JFrame
        Jfr.add(txt);

        // Displaying the JFrame on screen
        Jfr.setVisible(true);

    }

    public static void main(String[] args) {
        // create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }

}
