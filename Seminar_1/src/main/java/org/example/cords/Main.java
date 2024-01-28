package org.example.cords;

public class Main {
    public static void main(String[] args) {
        Vector vectOne = new Vector(3,3,3);
        Vector vectOTwo = new Vector(3,3,3);

        System.out.println(vectOne);
        System.out.println("vectOne.length() = " + vectOne.length());
        System.out.println("vectOne.scalarProduct(vectOTwo) = " + vectOne.scalarProduct(vectOTwo));
    }
}
