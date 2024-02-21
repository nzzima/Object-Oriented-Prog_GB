package org.example.model;

import org.example.service.*;

public class Calculator implements OperateService {
    ComplexNumber first;
    ComplexNumber second;
    Character operation;

    public Calculator() {
    }

    public Calculator(ComplexNumber first, ComplexNumber second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public ComplexNumber div(ComplexNumber A, ComplexNumber B) {
        ComplexCalculateDiv complexCalculateDiv = new ComplexCalculateDiv();
        return complexCalculateDiv.div(A, B);
    }

    @Override
    public ComplexNumber multi(ComplexNumber A, ComplexNumber B) {
        ComplexCalculateMul complexCalculateMul = new ComplexCalculateMul();
        return complexCalculateMul.multi(A, B);
    }

    @Override
    public ComplexNumber sum(ComplexNumber A, ComplexNumber B) {
        ComplexCalculateSum complexCalculateSum = new ComplexCalculateSum();
        return complexCalculateSum.sum(A, B);
    }
}
