package src.SwingApp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Swing2 {
    JLabel label;

    Swing2(){
        JFrame jfr = new JFrame("Event Handler in Swing");
        
        jfr.setLayout(new FlowLayout());

        jfr.setSize(250,100);

        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Making two buttons
        JButton bttn1 = new JButton("Alpha");
        JButton bttn2 = new JButton("Beta");

        bttn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Alpha was pressed");                
            }
        });

        bttn2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Beta was pressed");
            }
            
        });

        label = new JLabel("Click on any button ");

        jfr.add(bttn1);
        jfr.add(bttn2);
        jfr.add(label);

        jfr.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Swing2();
            }
        });
    }
}
