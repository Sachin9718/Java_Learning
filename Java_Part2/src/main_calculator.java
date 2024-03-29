package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main_calculator implements ActionListener {
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] funtionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton,negButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    // values
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    main_calculator() {
        frame = new JFrame("Sachin's Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // TextField
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        // Functions Buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("delete");
        clrButton = new JButton("clear");
        negButton = new JButton("(-)");

        funtionButtons[0] = addButton;
        funtionButtons[1] = subButton;
        funtionButtons[2] = mulButton;
        funtionButtons[3] = divButton;
        funtionButtons[4] = decButton;
        funtionButtons[5] = equButton;
        funtionButtons[6] = delButton;
        funtionButtons[7] = clrButton;
        funtionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            funtionButtons[i].addActionListener(this);
            funtionButtons[i].setFont(myFont);
            funtionButtons[i].setFocusable(false);
        }
        
        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        // Number Buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // Panel to have all the numbers and funtion buttons
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.gray);

        // adding buttons into panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        // panel.add(numberButtons[10]);

        frame.add(panel);
        frame.add(negButton);
        frame.add(clrButton);
        frame.add(delButton);
        frame.add(textfield);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());

            // calculations
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textfield.setText("");
            textfield.setText(String.valueOf(result));
            num1 = result;
        }


        // clear button 
        if (e.getSource() == clrButton) {
            num1 = 0;
            textfield.setText(null);
        }

        // delete button 
        if (e.getSource() == delButton) {
            String str = textfield.getText();
            textfield.setText("");
            for (int i = 0; i < str.length()-1; i++) {
                textfield.setText(textfield.getText()+str.charAt(i));
            }
        }
        if (e.getSource() == negButton) {
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));
        }

    }

    public static void main(String[] args) {
        main_calculator calc = new main_calculator();
    }
}
