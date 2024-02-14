package org.example.library;

public class ElectronBook extends Book {
    private String formatRead;
    private Integer size;

    public ElectronBook(String title, String author, int pages, BookGenre bookGenre) {
        super(title, author, pages, bookGenre);
    }

    public ElectronBook(String title, String author, int pages, BookGenre bookGenre, String formatRead, Integer size) {
        super(title, author, pages, bookGenre);
        this.formatRead = formatRead;
        this.size = size;
    }
}
