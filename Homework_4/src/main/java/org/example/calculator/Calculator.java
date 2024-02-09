package org.example.calculator;

import java.util.List;

public class Calculator {
    /**
     * Обобщенный метод суммирования чисел
     * @param numbers Список чисел
     * @return Результат
     */
    public double sum(List<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    /**
     * Обобщенный метод умножения чисел
     * @param numbers Список чисел
     * @return Результат
     */
    public double multiply(List<? extends Number> numbers) {
        double result = 1;
        for (Number number : numbers) {
            result *= number.doubleValue();
        }
        return result;
    }

    /**
     * Обобщенный метод деления чисел {a, b} => b / a
     * @param numbers 2 числа
     * @return Результат
     */
    public double division(List<? extends Number> numbers) {
        double result = 0;
        if (numbers.get(0).doubleValue() == 0) {
            throw new RuntimeException("На ноль делить нельзя!");
        } else {
            result = numbers.get(1).doubleValue() / numbers.get(0).doubleValue();
        }
        return result;
    }

    /**
     * Метод для преобразования десятичного числа формата String в двоичный формат
     * @param number Число формата String
     * @return Результат
     */
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

    /**
     * Обобщенный метод для преобразования десятичного числа в двоичный формат
     * @param number Число
     * @return Результат
     */
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

    /**
     * Метод для преобразования дробной части десятичного числа в двоичный формат
     * @param num Дробная часть числа
     * @return Результат
     */
    private String fractionalToBinary(double num) {
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
}
