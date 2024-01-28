package org.example;

public class HomeCat extends Cat{

    private final int MAX_RUN_DIST = 200;

    static int counter;

    public HomeCat(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println("Домашний кот пробежал " + distance + " метров");
        } else {
            System.out.println("Домашний кот не пробежал");
        }
    }

}
