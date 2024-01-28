package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик");
        System.out.println("Dog.getDogCounter() = " + Dog.getDogCounter());
        System.out.println("Animal.counter = " + Animal.counter);
        HomeCat homeCat = new HomeCat("Кеша");
        System.out.println("HomeCat.homeCatCounter = " + HomeCat.counter);
        System.out.println("Animal.counter = " + Animal.counter);
        Tiger tiger = new Tiger("Грэта");
        System.out.println("Tiger.tigerCounter = " + Tiger.counter);
        System.out.println("Animal.counter = " + Animal.counter);

        List<Animal> animals = new ArrayList<>(Arrays.asList(
                new HomeCat("Бобик"),
                new Tiger("Грэк"),
                new Dog("Шарик")
        ));
        for (Animal animal : animals) {
            animal.run(new Random().nextInt(100, 500));
            animal.swim(new Random().nextInt(15));
        }
    }
}