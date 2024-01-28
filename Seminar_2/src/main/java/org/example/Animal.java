package org.example;

public abstract class Animal {
    protected String name;

    public abstract void run(int distance);
    public abstract void swim(int distance);

    static int counter;

    public Animal(String name) {
        this.name = name;
        counter++;
    }
}
