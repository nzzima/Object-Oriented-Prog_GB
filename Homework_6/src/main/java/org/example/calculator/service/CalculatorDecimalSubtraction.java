package org.example.calculator.service;

import org.example.calculator.service.SubtractionService;

import java.util.List;

public class CalculatorDecimalSubtraction implements SubtractionService {
    @Override
    public String subtraction(List<? extends Number> numbers) {
        return String.valueOf(numbers.get(1).doubleValue() - numbers.get(0).doubleValue());
    }
}
