package src.SwingPaint;

import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class PaintPanel extends JPanel {
    Insets ins;
    Random rand;

    PaintPanel() {
        setBorder(BorderFactory.createLineBorder(Color.red, 5));

        rand = new Random();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x, y, x2, y2;

        int height = getHeight();
        int width = getWidth();

        ins = getInsets();

        // draw ten lines
        for (int i = 0; i < 10; i++) {
            x = rand.nextInt(width - ins.left);
            y = rand.nextInt(height - ins.bottom);
            x2 = rand.nextInt(width - ins.left);
            y2 = rand.nextInt(height - ins.bottom);

            
            // ḍrwa line
            g.drawLine(x, y, x2, y2);
        }

    }
}
