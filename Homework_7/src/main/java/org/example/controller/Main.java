package org.example.controller;

import org.example.service.ConsoleLogger;
import org.example.service.LogCalculatorFactory;

public class Main {
    public static void main(String[] args) {
        LogCalculatorFactory logCalculatorFactory = new LogCalculatorFactory(new ConsoleLogger());
        Controller controller = new Controller(logCalculatorFactory);
        controller.start();
    }
}