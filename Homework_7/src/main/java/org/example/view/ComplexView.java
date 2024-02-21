package org.example.view;

import org.example.model.ComplexNumber;

public class ComplexView {
    public void PrintComplex(ComplexNumber number) {
        System.out.print("Результат: ");
        if (number.getImage() > 0) {
            System.out.println(number.getReal() + " + " + number.getImage() + "i");
        } else if (number.getImage() < 0) {
            System.out.println(number.getReal() + "" + number.getImage() + "i");
        } else {
            System.out.println(number.getReal());
        }
        System.out.println("---------------------------------------------------");
    }
}
