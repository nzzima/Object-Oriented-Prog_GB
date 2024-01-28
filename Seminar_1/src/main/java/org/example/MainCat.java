package org.example;

public class MainCat {
    public static void main(String[] args) {
        Cat catOne = new Cat("barsik","gray",4);
        System.out.println(catOne);
        catOne.setAge(100);
        catOne.setAge(10);
        System.out.println(catOne);
    }
}
