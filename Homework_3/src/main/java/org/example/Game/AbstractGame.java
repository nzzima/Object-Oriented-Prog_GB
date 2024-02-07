package org.example.Game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{
    abstract List<String> generateCharList();
    abstract List<String> generateRusAlphabet();
    abstract List<String> generateEngAlphabet();
    private String word;
    Integer tryCount;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer tryCount) {
        word = generateWord(sizeWord);
        this.tryCount = tryCount;
        gameStatus = GameStatus.START;
    }

    private String generateWord(Integer sizeWord) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            int randomAlphabet = new Random().nextInt(1, 4);
            List<String> alphabet;
            String message;

            switch (randomAlphabet) {
                case 1:
                    alphabet = generateCharList();
                    message = "Компьютер загадал число!\n";
                    System.out.println(message);
                    writer.append(message);
                    break;
                case 2:
                    alphabet = generateRusAlphabet();
                    message = "Компьютер загадал слово на русском языке!\n";
                    System.out.println(message);
                    writer.append(message);
                    break;
                case 3:
                    alphabet = generateEngAlphabet();
                    message = "Компьютер загадал слово на английском языке!\n";
                    System.out.println(message);
                    writer.append(message);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + randomAlphabet);
            }

            Random rnd = new Random();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < sizeWord; i++) {
                int randomIndex = rnd.nextInt(alphabet.size());
                result.append(alphabet.get(randomIndex));
                alphabet.remove(alphabet.get(randomIndex));
            }
            return result.toString();

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
        return null;
    }

    @Override
    public Answear inputValue(String value) {
        if (!getGameStatus().equals(GameStatus.START)) {
            throw new RuntimeException("Игра не запущена");
        }
        int cowCounter = 0;
        int bullCounter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                cowCounter++;
                bullCounter++;
            } else if (word.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++;
            }
        }

        tryCount--;
        if (tryCount == 0) {
            gameStatus = GameStatus.LOSE;
        } else if (bullCounter == word.length()) {
            gameStatus = GameStatus.WIN;
        }
        return new Answear(cowCounter, bullCounter, tryCount);
    }
    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
