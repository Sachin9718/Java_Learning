package src;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditor extends JFrame implements ActionListener {

    // components
    JTextArea textArea;
    JScrollPane scrollPane;
    JLabel fontLabel;
    JSpinner fontSizeSpinner;
    JButton fontColorButton;
    JComboBox fontBox;


    // menur bar
    JMenuBar menuBar;
    JMenu filemenu;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    TextEditor() {
        this.setTitle("Sachin's Text Editor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);

        // addin textarea
        textArea = new JTextArea();
        // textArea.setPreferredSize(new DimensionUIResource(480, 450));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new FontUIResource("Arial", FontUIResource.PLAIN, 20));

        // adding scroll bar
        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new DimensionUIResource(480, 400));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Font change according to user
        fontLabel = new JLabel("Font: ");
        fontSizeSpinner = new JSpinner();
        fontSizeSpinner.setPreferredSize(new DimensionUIResource(50, 25));
        fontSizeSpinner.setValue(20);
        fontSizeSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                textArea.setFont(new FontUIResource(textArea.getFont().getFamily(), FontUIResource.PLAIN,
                        (int) fontSizeSpinner.getValue()));
            }

        });

        // chose a color
        fontColorButton = new JButton("Colors");
        fontColorButton.addActionListener(this);

        // chose a font area
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontBox = new JComboBox<>(fonts);
        fontBox.addActionListener(this);
        fontBox.setSelectedItem("Arial");




        // Menu bar
        menuBar = new JMenuBar();
        filemenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        filemenu.add(openItem);
        filemenu.add(saveItem);
        filemenu.add(exitItem);
        menuBar.add(filemenu);

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);





        
        this.setJMenuBar(menuBar);
        this.add(fontLabel);
        this.add(fontSizeSpinner);
        this.add(fontColorButton);
        this.add(fontBox);
        this.add(scrollPane);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fontColorButton) {
            Color color = JColorChooser.showDialog(null, "Chose a color", Color.black);
            textArea.setForeground(color);
        }

        if (e.getSource() == fontBox) {
            textArea.setFont(new FontUIResource((String) fontBox.getSelectedItem(), FontUIResource.PLAIN,
                    textArea.getFont().getSize()));
        }


        // menu bar
        if (e.getSource() == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
            fileChooser.setFileFilter(filter);

            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                 File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                 Scanner fileIn = null;

                 try {
                    fileIn = new Scanner(file);
                    if (file.isFile()) {
                        while (fileIn.hasNextLine()) {
                            String line = fileIn.nextLine()+"\n";
                            textArea.append(line);
                        }
                    }
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                finally{
                    fileIn.close();
                }
            }
        }
        if (e.getSource() == saveItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));

            int saveResponse = fileChooser.showSaveDialog(null);
            if(saveResponse == JFileChooser.APPROVE_OPTION){
                File file;
                PrintWriter fileOut = null;

                file = new File(fileChooser.getSelectedFile().getAbsolutePath());

                try {
                    fileOut = new PrintWriter(file);
                    fileOut.println(textArea.getText());
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                finally{
                    fileOut.close();
                }
            }
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new TextEditor();
    }
}
