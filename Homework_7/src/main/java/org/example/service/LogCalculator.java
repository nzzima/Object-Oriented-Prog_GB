package org.example.service;

import org.example.model.Calculator;
import org.example.model.ComplexNumber;

public class LogCalculator implements OperateService{
    private OperateService operateService;
    private Logable logable;

    public LogCalculator(OperateService operateService, Logable logable) {
        this.operateService = operateService;
        this.logable = logable;
    }

    @Override
    public ComplexNumber div(ComplexNumber A, ComplexNumber B) {
        logable.log("Вызов метода деления числа " + A + " на число " + B);
        return operateService.div(A, B);
    }

    @Override
    public ComplexNumber multi(ComplexNumber A, ComplexNumber B) {
        logable.log("Вызов метода умножения числа " + A + " на число " + B);
        return operateService.multi(A, B);
    }

    @Override
    public ComplexNumber sum(ComplexNumber A, ComplexNumber B) {
        logable.log("Вызов метода суммы числа " + A + " и числа " + B);
        return operateService.sum(A, B);
    }
}
