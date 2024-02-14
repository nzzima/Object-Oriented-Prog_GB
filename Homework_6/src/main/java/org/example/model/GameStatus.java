package org.example.model;

public enum GameStatus {
    INIT("Запуск игры!"),
    START("Начало игры!"),
    WIN("Поздравляю, Вы победили!"),
    LOSE("К сожалению, Вы проиграли!");

    private final String message;

    GameStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
