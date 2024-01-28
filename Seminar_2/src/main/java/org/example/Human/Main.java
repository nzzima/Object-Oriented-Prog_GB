package org.example.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Car car = new Car();
        human.drive(car);
        human.drive(car);
        human.stop(car);
        Bicycle bicycle = new Bicycle();
        human.drive(bicycle);
    }
}
