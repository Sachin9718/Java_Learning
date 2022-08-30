package src.ExploreSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {

    JLabel label;

    ButtonDemo() {
        JFrame jfr = new JFrame("Image icons as Buttons");
        jfr.setLayout(new FlowLayout());
        jfr.setSize(200, 200);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add image into buttons
        ImageIcon i1 = new ImageIcon("src\\icons8-add-bookmark-40.png");
        JButton bttn1 = new JButton(i1);
        bttn1.setActionCommand("Bookmark icon");
        bttn1.addActionListener(this);
        jfr.add(bttn1);

        ImageIcon i2 = new ImageIcon("src\\icons8-picture-40.png");
        JButton bttn2 = new JButton(i2);
        bttn2.setActionCommand("Picture icon");
        bttn2.addActionListener(this);
        jfr.add(bttn2);

        ImageIcon i3 = new ImageIcon("src\\icons8-search-40.png");
        JButton bttn3 = new JButton(i3);
        bttn3.setActionCommand("Search icon");
        bttn3.addActionListener(this);
        jfr.add(bttn3);

        ImageIcon i4 = new ImageIcon("src\\icons8-twitter-40.png");
        JButton bttn4 = new JButton(i4);
        bttn4.setActionCommand("Twitter icon");
        bttn4.addActionListener(this);
        jfr.add(bttn4);

        // create a label
        label = new JLabel("Chose a Template");
        jfr.add(label);

        jfr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("You select -> " + e.getActionCommand());

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
