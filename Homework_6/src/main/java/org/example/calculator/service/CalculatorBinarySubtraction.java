package org.example.calculator.service;

import org.example.calculator.service.SubtractionService;

import java.util.List;

public class CalculatorBinarySubtraction implements SubtractionService {
    @Override
    public String subtraction(List<? extends Number> numbers) {
        return Integer.toBinaryString(Integer.parseInt(numbers.get(1).toString(), 2) -
                                        Integer.parseInt(numbers.get(0).toString(), 2));
    }
}
