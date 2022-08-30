package src.MainMenue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menu implements ActionListener {
    JLabel label;

    Menu() {
        JFrame jfr = new JFrame("Main Menue");
        jfr.setLayout(new FlowLayout());
        jfr.setSize(300, 300);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label that will display menu bar
        label = new JLabel();

        // Menu bar
        JMenuBar jmb = new JMenuBar();
        // File Menu
        JMenu file = new JMenu("File");
        // menu item
        JMenuItem open = new JMenuItem("Open");
        JMenuItem close = new JMenuItem("Close");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(open);
        file.add(close);
        file.add(save);
        file.add(exit);
        jmb.add(file);

        // Creating Options in menu
        JMenu Options = new JMenu("Options");
        // color menu
        JMenu colors = new JMenu("Colors");
        JCheckBoxMenuItem red = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem Green = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem Blue = new JCheckBoxMenuItem("Blue");
        colors.add(red);
        colors.add(Green);
        colors.add(Blue);
        Options.add(colors);

        // Creating priority Submenu
        JMenu priority = new JMenu("Priority");
        JMenuItem High = new JMenuItem("High");
        JMenuItem low = new JMenuItem("Low");
        priority.add(High);
        priority.add(low);
        Options.add(priority);

        // Create Rest menu item
        JMenuItem reset = new JMenuItem("Reset");
        Options.addSeparator();
        Options.add(reset);

        // adding options menu into menu bar
        jmb.add(Options);

        // Creating Help Menu
        JMenu Help = new JMenu("Help");
        JMenuItem About = new JMenuItem("About");
        Help.add(About);
        jmb.add(Help);

        open.addActionListener(this);
        close.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        red.addActionListener(this);
        Green.addActionListener(this);
        Blue.addActionListener(this);
        High.addActionListener(this);
        low.addActionListener(this);
        reset.addActionListener(this);
        Help.addActionListener(this);
        jfr.add(label);

        JMenu File = new JMenu("New File");
        File.setMnemonic(KeyEvent.VK_F);
        JMenuItem Open = new JMenuItem("Open", KeyEvent.VK_O);
        Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        JMenuItem Close = new JMenuItem("Close", KeyEvent.VK_C);
        Close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        JMenuItem Save = new JMenuItem("Save", KeyEvent.VK_S);
        Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        JMenuItem Exit = new JMenuItem("Exit", KeyEvent.VK_E);
        Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        File.add(Open);
        File.add(Close);
        File.add(Save);
        File.add(Exit);
        jmb.add(File);
        jfr.setJMenuBar(jmb);
        jfr.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comstr = e.getActionCommand();

        if (comstr.equals("Exit")) {
            System.exit(0);
        }

        label.setText(comstr + " Selected");

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Menu();
            }
        });
    }

}
