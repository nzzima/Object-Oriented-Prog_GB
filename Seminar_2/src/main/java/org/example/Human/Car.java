package org.example.Human;

public class Car implements Transport {
    @Override
    public void run() {
        System.out.println("Начинаем поездку на машине");
    }
    @Override
    public void stop() {
        System.out.println("Заканчиваем поездку на машине");
    }
}
