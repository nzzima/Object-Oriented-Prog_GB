package org.example.Fruits;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.BANANA;
        switch (fruit) {
            case APPLE, PINAPPLE, BANANA, ORANGE, WATERMELON -> System.out.println(fruit.getNameFruit());
            default -> System.out.println("Такого фрукта не существует");
        }
    }
}
