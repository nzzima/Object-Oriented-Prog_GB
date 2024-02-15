package org.example.calculator.controller;

import org.example.calculator.model.BinaryCalculator;
import org.example.calculator.model.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> binNumbers1 = new ArrayList<>(Arrays.asList(1111, 10));
        Calculator decResult = new Calculator(binNumbers1);
        BinaryCalculator binResult = new BinaryCalculator(binNumbers1);
        decResult.calculate('+');
        binResult.binCalculate('+');
        binResult.calculate('*');
        binResult.calculate('/');

        List<Integer> binNumbers2 = new ArrayList<>(Arrays.asList(10, 101101));
        decResult = new Calculator(binNumbers2);
        binResult = new BinaryCalculator(binNumbers2);
        decResult.calculate('-');
        binResult.binCalculate('-');
        binResult.calculate('*');
        binResult.calculate('/');

        List<Integer> number1 = new ArrayList<>(List.of(16));
        decResult = new Calculator(number1);
        decResult.calculate('b');
        List<Double> number2 = new ArrayList<>(List.of(16.25));
        decResult = new Calculator(number2);
        decResult.calculate('b');
    }
}
