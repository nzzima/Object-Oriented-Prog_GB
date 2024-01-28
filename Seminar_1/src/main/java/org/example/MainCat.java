package org.example;

public class MainCat {
    public static void main(String[] args) {
        Cat catOne = new Cat("barsik","gray",4);
        System.out.println("Кот: " + catOne.getName() +
                "\n имеет цвет: " + catOne.getColor() +
                "\n возраста: " + catOne.getAge());
        catOne.setAge(100);
        System.out.println("Кот: " + catOne.getName() +
                "\n имеет цвет: " + catOne.getColor() +
                "\n возраста: " + catOne.getAge());
    }
}
