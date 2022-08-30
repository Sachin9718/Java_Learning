package src.ExploreSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class textField {
    textField() {
        JFrame jfr = new JFrame("Here you can enter text   ");
        jfr.setLayout(new FlowLayout());
        jfr.setSize(300, 200);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adding text field
        JTextField jtxt = new JTextField(15);
        jfr.add(jtxt);
        JLabel label2 = new JLabel("Enter your name here");

        JLabel label = new JLabel();
        jfr.add(label);
        jfr.add(label2);

        // adding event listener
        jtxt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(jtxt.getText());
            }

        });

        jfr.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new textField();
            }
        });
    }
}
