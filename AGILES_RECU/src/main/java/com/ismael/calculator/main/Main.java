package main.java.com.ismael.calculator.main;

import main.java.com.ismael.calculator.controlador.CalculatorController;
import main.java.com.ismael.calculator.modelo.CalculatorModel;
import main.java.com.ismael.calculator.vista.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        new CalculatorController(model, view);
        view.setVisible(true);
    }
}