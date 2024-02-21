package org.example.service;

import org.example.model.ComplexNumber;

public class ComplexCalculateDiv implements DivService{
    @Override
    public ComplexNumber div(ComplexNumber A, ComplexNumber B) {
        double divReal = (A.getReal() * B.getReal() + A.getImage() * B.getImage()) /
                         (B.getReal()* B.getReal() + B.getImage() * B.getImage());
        double divImage = (A.getImage()*B.getReal() - A.getReal()*B.getImage()) /
                          (B.getReal()* B.getReal() + B.getImage() * B.getImage());
        return new ComplexNumber(divReal, divImage);
    }
}
