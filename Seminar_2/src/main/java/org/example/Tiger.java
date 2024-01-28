package org.example;

public class Tiger extends Cat{
    private final int MAX_RUN_DIST = 300;

    static int counter;

    public Tiger(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DIST) {
            System.out.println("Тигр пробежал " + distance + " метров");
        } else {
            System.out.println("Тигр не пробежал");
        }
    }

}
