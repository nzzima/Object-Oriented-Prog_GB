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
}
