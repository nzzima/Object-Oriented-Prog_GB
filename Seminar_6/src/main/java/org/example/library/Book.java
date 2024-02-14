package org.example.library;

public class Book{
    private String title;
    private String author;
    private int pages;
    private BookGenre bookGenre;

    public Book(String title, String author, int pages, BookGenre bookGenre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.bookGenre = bookGenre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", bookGenre=" + bookGenre +
                "}";
    }
}
