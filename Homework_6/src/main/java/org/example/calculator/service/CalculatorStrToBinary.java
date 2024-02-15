package org.example.calculator.service;

import org.example.calculator.service.fractionalToBinaryService;
import org.example.calculator.service.strToBinaryService;

public class CalculatorStrToBinary implements strToBinaryService, fractionalToBinaryService {
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
    public String toBinary(String number) {
        if (number.contains(".")) {
            double value = Double.parseDouble(number);
            int wholePart = (int) value;
            double fractionalPart = value - wholePart;
            if (fractionalPart == 0) {
                return Integer.toBinaryString(wholePart);
            } else {
                return Integer.toBinaryString(wholePart) + '.' + fractionalToBinary(fractionalPart);
            }
        } else {
            return Integer.toBinaryString(Integer.parseInt(number));
        }
    }
}
