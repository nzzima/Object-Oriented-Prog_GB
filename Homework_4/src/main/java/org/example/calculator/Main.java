package org.example.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        List<Integer> array1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("calculator.sum(array1) = " + calculator.sum(array1));

        List<Double> array2 = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.5));
        System.out.println("calculator.sum(array2) = " + calculator.sum(array2));

        List<Integer> array3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("calculator.multiply(array3) = " + calculator.multiply(array3));

        List<Double> array4 = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.5));
        System.out.println("calculator.multiply(array4) = " + calculator.multiply(array4));

        List<Integer> array5 = new ArrayList<>(Arrays.asList(3, 9));
        System.out.println("calculator.multiply(array5) = " + calculator.division(array5));

        List<Double> array6 = new ArrayList<>(Arrays.asList(3.2, 15.5));
        System.out.println("calculator.multiply(array6) = " + calculator.division(array6));

        List<Integer> number1 = new ArrayList<>(List.of(18));
        System.out.println("calculator.toBinary(number1) = " + calculator.toBinary(number1));

        List<Double> number2 = new ArrayList<>(List.of(9.4));
        System.out.println("calculator.toBinary(number2) = " + calculator.toBinary(number2));

        String number3 = "17";
        System.out.println("calculator.toBinary(number3) = " + calculator.toBinary(number3));

        String number4 = "9.7";
        System.out.println("calculator.toBinary(number4) = " + calculator.toBinary(number4));

        String number5 = "5.0";
        System.out.println("calculator.toBinary(number5) = " + calculator.toBinary(number5));
    }
}
