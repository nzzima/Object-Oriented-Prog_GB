package org.example.controller;

import org.example.model.Calculator;
import org.example.model.ComplexNumber;
import org.example.service.*;
import org.example.view.ComplexView;

import java.util.Scanner;

public class Controller {
    private CalculatorFactoryService calculatorFactoryService;
    private ComplexCalculateDiv complexCalculateDiv;
    private ComplexCalculateMul complexCalculateMul;
    private ComplexCalculateSum complexCalculateSum;
    private ComplexView complexView;

    public Controller(CalculatorFactoryService calculatorFactoryService) {
        this.calculatorFactoryService = calculatorFactoryService;
    }

    public void start() {
        System.out.println("-------------Калькулятор комплексных чисел-------------\n");
        while (true) {
            Scanner scanner = new Scanner(System.in);

            ComplexNumber first = enterComplex(scanner);
            System.out.print("Введите операцию: + , * , / --> ");
            String operation = scanner.nextLine();
            ComplexNumber second = enterComplex(scanner);

            OperateService calculator = calculatorFactoryService.create(first, second);

            ComplexNumber result;
            ComplexView complexView = new ComplexView();

            switch (operation) {
                case "+":
                    result = calculator.sum(first, second);
                    complexView.PrintComplex(result);
                    break;
                case "*":
                    result = calculator.multi(first, second);
                    complexView.PrintComplex(result);
                    break;
                case "/":
                    result = calculator.div(first, second);
                    complexView.PrintComplex(result);
                    break;
                default:
                    throw new RuntimeException("Не верная операция!");
            }

            System.out.print("\n1 --- Продолжить\n2 --- Остановить калькулятор\nВвод: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
            }
            else break;
        }
    }

    public ComplexNumber enterComplex(Scanner scanner) {
        System.out.print("Введите действительную часть числа: ");
        double realFirst = Double.parseDouble(scanner.nextLine());
        System.out.print("Введите мнимую часть числа: ");
        double imageFirst = Double.parseDouble(scanner.nextLine());
        return new ComplexNumber(realFirst, imageFirst);
    }
}
