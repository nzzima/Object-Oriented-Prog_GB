package org.example.service;

import org.example.model.Calculator;
import org.example.model.ComplexNumber;

public class CalculatorFactory implements CalculatorFactoryService{
    @Override
    public OperateService create(ComplexNumber first, ComplexNumber second) {
        return new Calculator(first, second);
    }
}
