package org.example.service;

import org.example.model.ComplexNumber;

public class ComplexCalculateSum implements SumService{
    @Override
    public ComplexNumber sum(ComplexNumber A, ComplexNumber B) {
        double sumReal = A.getReal() + B.getReal();
        double sumImage = A.getImage() + B.getImage();
        return new ComplexNumber(sumReal, sumImage);
    }
}
