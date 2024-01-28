package org.example.Human;

public class Bicycle implements Transport {
    @Override
    public void run() {
        System.out.println("Начинаем поездку на велосипеде");
    }
    @Override
    public void stop() {
        System.out.println("Заканчиваем поездку на велосипеде");
    }
}
