package org.example;

public class Dog extends Animal{

    private final int MAX_RUN_DIST = 500;
    private final int MAX_SWIM_DIST = 10;

    static int counter;

    public Dog(String name) {
        super(name);
        counter++;
    }

    public static int getDogCounter() {
        return counter;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println("Собака пробежала " + distance + " метров");
        } else {
            System.out.println("Собака не пробежала " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DIST) {
            System.out.println("Собака проплыла " + distance + " метров");
        } else {
            System.out.println("Собака не проплыла " + distance + " метров");
        }
    }
}
