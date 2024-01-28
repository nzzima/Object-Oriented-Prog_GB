package org.example.cords;

public class Main {
    public static void main(String[] args) {
        Vector vectOne = new Vector(3,2,3);
        Vector vectTwo = new Vector(4,3,5);

        System.out.println(vectOne);
        System.out.println("vectOne.length() = " + vectOne.length());
        System.out.println("vectOne.scalarProduct(vectOTwo) = " + vectOne.scalarProduct(vectTwo));
        System.out.println("vectOne.vectMultiply(vectTwo) = " + vectOne.vectMultiply(vectTwo));
    }
}
