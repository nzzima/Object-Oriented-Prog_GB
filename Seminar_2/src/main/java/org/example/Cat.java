package org.example;

public abstract class Cat extends Animal{
    private final int MAX_RUN_DIST = 300;
    private final int MAX_SWIM_DIST = 0;

    static int counter;

    public Cat(String name) {
        super(name);
        counter++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
