package org.example.calculator.model;

import org.example.calculator.service.*;

import java.util.List;

public class Calculator {
    protected List<? extends Number> numbers;

    public Calculator(List<? extends Number> numbers) {
        this.numbers = numbers;
    }

    public void calculate(char operation) {
        switch (operation) {
            case '+':
                SumService sumDecimal = new CalculatorDecimalSum();
                System.out.println("sumDecimal.sum(numbers) = " + sumDecimal.sum(numbers));
                break;
            case '-':
                SubtractionService subDecimal = new CalculatorDecimalSubtraction();
                System.out.println("subDecimal.subtraction(numbers) = " + subDecimal.subtraction(numbers));
                break;
            case '*':
                CalculatorMultiply mulDecimal = new CalculatorMultiply();
                System.out.println("mulDecimal.multiply(numbers) = " + mulDecimal.multiply(numbers));
                break;
            case '/':
                CalculatorDivision divDecimal = new CalculatorDivision();
                System.out.println("divDecimal.division(numbers) = " + divDecimal.division(numbers));
                break;
            case 'b':
                CalculatorNumToBinary res = new CalculatorNumToBinary();
                System.out.println("res.toBinary(numbers) = " + res.toBinary(numbers));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
}