package org.example.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Libraries implements Searchable, LibrariesManager{
    private List<Book> bookList;

    public Libraries() {
        bookList = generateBooks();
    }

    private List<Book> generateBooks() {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(new Book("Метель",
                    "А.С.Пушкин",
                    new Random().nextInt(100),
                    new BookGenre("Любовный роман")));
        }
        return result;
    }

    @Override
    public List<Book> searchBookByAuthor(String author_name) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().contains(author_name)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public void add(Book book) {
        bookList.add(book);
    }
}
