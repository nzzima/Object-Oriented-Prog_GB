package org.example.library;

import java.util.List;

public interface Searchable {
    List<Book> searchBookByAuthor(String author_name);
}
