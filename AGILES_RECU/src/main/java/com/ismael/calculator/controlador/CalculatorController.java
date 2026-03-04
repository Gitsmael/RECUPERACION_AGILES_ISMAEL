package main.java.com.ismael.calculator.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.java.com.ismael.calculator.modelo.CalculatorModel;
import main.java.com.ismael.calculator.vista.CalculatorView;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        initController();
    }

    private void initController() {
        // Números
        for (int i = 0; i <= 9; i++) {
            int digit = i;
            view.numButtons[i].addActionListener(e -> {
                model.addDigit(digit);
                view.display.setText(model.getDisplay());
            });
        }

        view.dotButton.addActionListener(e -> {
            model.addDot();
            view.display.setText(model.getDisplay());
        });

        view.sumButton.addActionListener(e -> {
            model.setOperationSum();
            view.display.setText(model.getDisplay());
        });

        view.expButton.addActionListener(e -> {
            model.setOperationExp();
            view.display.setText(model.getDisplay());
        });

        view.equalsButton.addActionListener(e -> {
            model.calculateResult();
            view.display.setText(model.getDisplay());
        });

        view.cButton.addActionListener(e -> {
            model.resetCurrent();
            view.display.setText(model.getDisplay());
        });

        view.circButton.addActionListener(e -> {
            model.calculateCircumference();
            view.display.setText(model.getDisplay());
        });

        view.factButton.addActionListener(e -> {
            try {
                model.calculateFactorial();
                view.display.setText(model.getDisplay());
            } catch (RuntimeException ex) {
                view.display.setText("Error: " + ex.getMessage());
            }
        });
    }
}