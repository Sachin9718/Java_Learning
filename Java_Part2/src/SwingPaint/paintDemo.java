package src.SwingPaint;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class paintDemo {
    PaintPanel pp;

    paintDemo() {
        JFrame jfr = new JFrame("This is paint Frame");
        jfr.setSize(300, 200);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pp = new PaintPanel();
        jfr.add(pp);
        jfr.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new paintDemo();
            }
        });
    }
}
