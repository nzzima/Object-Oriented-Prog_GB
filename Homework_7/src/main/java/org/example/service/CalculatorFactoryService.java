package org.example.service;

import org.example.model.Calculator;
import org.example.model.ComplexNumber;

public interface CalculatorFactoryService {
    OperateService create(ComplexNumber first, ComplexNumber second);
}
