package org.example.calculator;

public class LogCalculator implements Calculable{
    private Calculable calculable;
    private Logable logable;
    public LogCalculator(Calculator calculator, Logable logable) {
        this.calculable = calculator;
        this.logable = logable;
    }

    @Override
    public Calculable sum(int arg) {
        logable.log("Вызов метода суммы с аргументом " + arg); //Логирование
        return calculable.sum(arg); //Вызов обыкновенного метода суммы из класса Calculator (не изменяем Calculator)
    }

    @Override
    public Calculable multi(int arg) {
        logable.log("Вызов метода умножения с аргументом " + arg);
        return calculable.multi(arg);
    }

    @Override
    public int getResult() {
        logable.log("Результат который запросил пользователь");
        return calculable.getResult();
    }
}
