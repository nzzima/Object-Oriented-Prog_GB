package org.example.library;

public class BookGenre implements Genre{
    private String name;

    public BookGenre(String name) {
        this.name = name;
    }

    @Override
    public String getGenre() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
