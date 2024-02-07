package org.example.Game;

public interface Game {
    void start(Integer sizeWord, Integer tryCount);
    Answear inputValue(String value);
    GameStatus getGameStatus();
}
