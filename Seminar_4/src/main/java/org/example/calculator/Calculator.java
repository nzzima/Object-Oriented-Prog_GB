package org.example.calculator;

import java.util.List;

/**
 * бОбыкновенный класс Калькулятор
 */
public class Calculator {


    /**
     * Обобщенный метод суммирования чисел
     * @param numbers Список чисел
     * @return Результат
     */
    public double sum(List<? extends Number> numbers) {
        double result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i).doubleValue();
        }
        return result;
    }
}
