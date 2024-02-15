package org.example.calculator.service;

import org.example.calculator.service.fractionalToBinaryService;
import org.example.calculator.service.wholeToBinaryService;

import java.util.List;

public class CalculatorNumToBinary implements wholeToBinaryService, fractionalToBinaryService {
    @Override
    public String fractionalToBinary(double num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < 10) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }

    @Override
    public String toBinary(List<? extends Number> number) {
        String result = "";
        int wholePart = number.get(0).intValue();
        double fractionalPart = number.get(0).doubleValue() - wholePart;
        if (fractionalPart == 0) {
            result = Integer.toBinaryString(wholePart);
        } else {
            result = Integer.toBinaryString(wholePart) + '.' + fractionalToBinary(fractionalPart);
        }

        return result;
    }
}
