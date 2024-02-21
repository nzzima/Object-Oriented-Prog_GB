package org.example.model;

public class ComplexNumber {
    private double real;
    private double image;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}
