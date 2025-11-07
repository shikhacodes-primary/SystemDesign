package DesignPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "book1"));
        bookList.add(new Book(2, "book2"));
        bookList.add(new Book(3, "book3"));
        bookList.add(new Book(4, "book4"));

        Library library = new Library(bookList);

        Iterator itr = library.createIterator();
        while(itr.hasNext()) {
            Book book = (Book) itr.next();
            System.out.println("BookId:: " + book.getBookId() + " || BookName:: " + book.getBookName());
        }

    }
}
