package org.example.calculator.service;

import java.util.List;

public class CalculatorMultiply {
    public CalculatorMultiply() {
    }

    public double multiply(List<? extends Number> numbers) {
        double result = 1;
        for (Number number : numbers) {
            result *= number.doubleValue();
        }
        return result;
    }
}
