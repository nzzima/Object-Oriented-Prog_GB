package org.example.Game;

public enum GameStatus {
    INIT(""),
    START(""),
    WIN("Поздравляю, Вы победили!"),
    LOSE("К сожалению, Вы проиграли!");

    private String message;

    GameStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
