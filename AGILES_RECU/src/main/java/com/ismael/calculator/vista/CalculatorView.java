package main.java.com.ismael.calculator.vista;	
import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    public JLabel display;
    public JButton[] numButtons = new JButton[10];
    public JButton sumButton, equalsButton, cButton, dotButton, circButton, factButton, expButton;

    public CalculatorView() {
        setTitle("Calculator MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 600);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        setContentPane(panel);

        display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setBounds(50, 20, 300, 50);
        panel.add(display);

        int x = 50, y = 100;
        for (int i = 1; i <= 9; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].setBounds(x, y, 60, 60);
            panel.add(numButtons[i]);
            x += 70;
            if (i % 3 == 0) { x = 50; y += 70; }
        }

        numButtons[0] = new JButton("0");
        numButtons[0].setBounds(50, 310, 60, 60);
        panel.add(numButtons[0]);

        sumButton = new JButton("+");
        sumButton.setBounds(120, 310, 60, 60);
        panel.add(sumButton);

        equalsButton = new JButton("=");
        equalsButton.setBounds(190, 310, 60, 60);
        panel.add(equalsButton);

        cButton = new JButton("C");
        cButton.setBounds(260, 310, 60, 60);
        panel.add(cButton);

        dotButton = new JButton(".");
        dotButton.setBounds(50, 380, 60, 60);
        panel.add(dotButton);

        circButton = new JButton("Circum");
        circButton.setBounds(120, 380, 60, 60);
        panel.add(circButton);

        factButton = new JButton("!");
        factButton.setBounds(190, 380, 60, 60);
        panel.add(factButton);

        expButton = new JButton("Exp");
        expButton.setBounds(260, 380, 60, 60);
        panel.add(expButton);
    }
}