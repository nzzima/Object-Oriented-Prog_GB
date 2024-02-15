package org.example.calculator.service;

import org.example.calculator.service.SumService;

import java.util.List;

public class CalculatorDecimalSum implements SumService {
    @Override
    public String sum(List<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return String.valueOf(result);
    }
}
