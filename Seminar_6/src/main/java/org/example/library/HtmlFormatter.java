package org.example.library;

public class HtmlFormatter implements Formatter{
    @Override
    public void format(Book book) {
        System.out.println("Книга " + book.getTitle() + " переведена в формат .html");
    }
}
