package org.example;

import org.example.library.*;

public class Main {
    public static void main(String[] args) {
        Libraries libraries = new Libraries();
        System.out.println("libraries.searchBookByAuthor(\"Пушкин\") = "
                            + libraries.searchBookByAuthor("Пушкин"));
        Formatter formatter = new JsonFormatter();
        formatter.format(libraries.getBookList().get(0));
        formatter = new TextFormatter();
        formatter.format(libraries.getBookList().get(0));

        ElectronBook electronBook = new ElectronBook("Java. Полное руководство",
                "Шилдт. Г",
                200,
                null,
                "txt",
                1024);
        libraries.add(electronBook);
        System.out.println("libraries.getBookList() = " + libraries.getBookList());
    }
}