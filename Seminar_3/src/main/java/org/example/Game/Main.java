package org.example.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame ag = new NumberGame();
        ag.start(2, 3);
        System.out.print("Введите значение: ");
        Scanner sc = new Scanner(System.in);

        while (ag.getGameStatus().equals(GameStatus.START)) {
            Answear answear = ag.inputValue(sc.nextLine());
            System.out.println(answear);
        }
        System.out.println(ag.getGameStatus().getMessage());
    }
}
