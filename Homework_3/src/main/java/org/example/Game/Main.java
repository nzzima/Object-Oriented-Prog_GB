package org.example.Game;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру \"Быки - Коровы\"!\nДля просмотра лога игры введите в поле ответа" +
                    " слово \"Лог\"\n");
        while (true) {
            String globalAnswear = "";
            Scanner sc = new Scanner(System.in);
            try (FileWriter writer = new FileWriter("log.txt", true)) {
                String startToFile = "----------------Началась игра!----------------\n";
                writer.append(startToFile);
                writer.flush();

                AbstractGame ag = new NumberGame();
                ag.start(2, 5);
                System.out.print("Введите ваш ответ: ");

                while (ag.getGameStatus().equals(GameStatus.START)) {
                    String userAnswear = sc.nextLine();
                    if (userAnswear.equals("Лог")) {
                        showLog(1);
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
            System.out.println("Введите\n1 - Перезапуск игры\n2 - Остановить игру\n3 - Посмотреть лог и остановить игру");
            globalAnswear = sc.nextLine();

            if (globalAnswear.equals("2")) {
                break;
            } else if (globalAnswear.equals("3")) {
                showLog(0);
                break;
            }
        }
    }

    public static void showLog(int processing) {
        try (FileReader reader = new FileReader("log.txt")) {
            int c;
            System.out.println("-----------------------ЧТЕНИЕ ЛОГА-----------------------\n");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println("\n-------------------------КОНЕЦ---------------------------\n");
            if (processing == 1)
                System.out.print("Введите ваш ответ: ");
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
