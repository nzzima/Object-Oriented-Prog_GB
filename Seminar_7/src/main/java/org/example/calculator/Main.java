package org.example.calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
//      CalculableFactory calculableFactory = new CalculableFactory();
//      ViewCalculator view = new ViewCalculator(calculableFactory);

        LogCalculableFactory logCalculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(logCalculableFactory);
        view.run();
    }
}
