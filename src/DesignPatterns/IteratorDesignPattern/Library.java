package DesignPatterns.IteratorDesignPattern;

import java.util.List;

public class Library {
    List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
