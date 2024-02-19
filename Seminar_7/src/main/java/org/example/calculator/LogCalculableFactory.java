package org.example.calculator;

public class LogCalculableFactory implements ICalculableFactory{
    private Logable logable;

    public LogCalculableFactory(Logable logable) {
        this.logable = logable;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logable);
    }
}
