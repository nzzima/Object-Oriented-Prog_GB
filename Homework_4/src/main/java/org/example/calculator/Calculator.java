package org.example.calculator;

import com.sun.jdi.request.BreakpointRequest;

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
}
