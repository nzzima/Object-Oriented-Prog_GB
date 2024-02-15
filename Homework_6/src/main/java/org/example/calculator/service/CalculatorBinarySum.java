package org.example.calculator.service;

import org.example.calculator.service.SumService;

import java.util.List;

public class CalculatorBinarySum implements SumService {
    @Override
    public String sum(List<? extends Number> numbers) {
        int result = 0;
        for (Number number : numbers) {
            result += Integer.parseInt(number.toString(), 2);
        }
        return Integer.toBinaryString(result);
    }
}
