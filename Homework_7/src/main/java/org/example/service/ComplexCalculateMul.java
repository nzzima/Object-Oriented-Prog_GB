package org.example.service;

import org.example.model.ComplexNumber;

public class ComplexCalculateMul implements MulService{
    @Override
    public ComplexNumber multi(ComplexNumber A, ComplexNumber B) {
        double mulReal = A.getReal() * B.getReal() - A.getImage() * B.getImage();
        double mulImage = A.getImage() * B.getReal() + A.getReal() * B.getImage();
        return new ComplexNumber(mulReal, mulImage);
    }
}
