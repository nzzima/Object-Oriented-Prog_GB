package org.example.calculator.model;

import org.example.calculator.service.*;

import java.util.List;

public class BinaryCalculator extends Calculator{
    private String numStr;
    public BinaryCalculator(List<? extends Number> numbers) {
        super(numbers);
    }

    public BinaryCalculator(List<? extends Number> numbers, String numStr) {
        super(numbers);
        this.numStr = numStr;
    }

    public void binCalculate(char operation) {
        switch (operation) {
            case '+':
                SumService sumBinary = new CalculatorBinarySum();
                System.out.println("sumBinary.sum(numbers) = " + sumBinary.sum(numbers));
                break;
            case '-':
                SubtractionService subBinary = new CalculatorBinarySubtraction();
                System.out.println("subBinary.subtraction(numbers) = " + subBinary.subtraction(numbers));
                break;
            case 'b':
                CalculatorStrToBinary res = new CalculatorStrToBinary();
                System.out.println("res.toBinary(numStr) = " + res.toBinary(numStr));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}
