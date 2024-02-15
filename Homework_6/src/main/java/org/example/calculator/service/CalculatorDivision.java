package org.example.calculator.service;

import java.util.List;

public class CalculatorDivision {
    public CalculatorDivision() {
    }

    public double division(List<? extends Number> numbers) {
        double result = 0;
        if (numbers.get(0).doubleValue() == 0) {
            throw new RuntimeException("На ноль делить нельзя!");
        } else {
            result = numbers.get(1).doubleValue() / numbers.get(0).doubleValue();
        }
        return result;
    }
}
