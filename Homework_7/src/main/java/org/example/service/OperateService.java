package org.example.service;

import org.example.model.ComplexNumber;

public interface OperateService {
    ComplexNumber sum(ComplexNumber A, ComplexNumber B);
    ComplexNumber multi(ComplexNumber A, ComplexNumber B);
    ComplexNumber div (ComplexNumber A, ComplexNumber B);
}
