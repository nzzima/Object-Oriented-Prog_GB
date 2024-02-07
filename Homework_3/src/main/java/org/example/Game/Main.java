package org.example.Game;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру \"Быки - Коровы\"!\nДля просмотра лога игры введите в поле ответа" +
                            " слово \"Лог\"\n");
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            String startToFile = "----------------Началась игра!----------------\n";
            writer.append(startToFile);
            writer.flush();

            AbstractGame ag = new NumberGame();
            ag.start(2, 5);
            System.out.print("Введите ваш ответ: ");
            int count = 0;
            Scanner sc = new Scanner(System.in);

            while (ag.getGameStatus().equals(GameStatus.START)) {
                String userAnswear = sc.nextLine();
                if (userAnswear.equals("Лог")) {
                    try (FileReader reader = new FileReader("log.txt")) {
                        int c;
                        System.out.println("-----------------------ЧТЕНИЕ ЛОГА-----------------------\n");
                        while ((c=reader.read()) != -1) {
                            System.out.print((char)c);
                        }
                        System.out.println("\n-------------------------КОНЕЦ---------------------------\n");
                        System.out.print("Введите ваш ответ: ");
                    } catch (IOException error) {
                        System.out.println(error.getMessage());
                    }
                } else {
                    String scToFile = "Ответ пользователя: " + userAnswear + "\n";
                    Answear answear = ag.inputValue(userAnswear);
                    String ansToFile = answear.getCowCounter() + " коровы " + answear.getBullCounter() +
                            " быка, осталось попыток : " + answear.getTryCount() + "\n";
                    writer.append(scToFile);
                    writer.append(ansToFile);
                    writer.flush();
                    System.out.println(answear);
                    if (ag.getGameStatus().equals(GameStatus.START))
                        System.out.print("Введите ваш ответ: ");
                }
            }
            String statusToFile = ag.getGameStatus().getMessage() + "\n----------------------------------------------\n";
            writer.append(statusToFile);

            System.out.println(ag.getGameStatus().getMessage());

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
