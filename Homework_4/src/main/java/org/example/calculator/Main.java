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
    }
}
