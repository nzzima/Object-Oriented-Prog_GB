package org.example.service;

import org.example.model.Calculator;
import org.example.model.ComplexNumber;

public class LogCalculatorFactory implements CalculatorFactoryService{
    private Logable logable;

    public LogCalculatorFactory(Logable logable) {
        this.logable = logable;
    }

    @Override
    public OperateService create(ComplexNumber first, ComplexNumber second) {
        return new LogCalculator(new Calculator(first, second), logable);
    }
}
