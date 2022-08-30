package src.ExploreSwing;

import java.awt.*;
import javax.swing.*;

public class SwingImage {
    SwingImage() {
        JFrame jfr = new JFrame("There is an Image in JFrame");
        jfr.setLayout(new FlowLayout());
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setSize(200, 150);

        // create an Icon
        ImageIcon ii = new ImageIcon("src\\party-hat.png");
        JLabel label = new JLabel("Image", ii, JLabel.CENTER);

        jfr.add(label);

        jfr.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingImage();
            }
        });
    }
}
