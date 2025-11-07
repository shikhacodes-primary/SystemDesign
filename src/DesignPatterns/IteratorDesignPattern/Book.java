package DesignPatterns.IteratorDesignPattern;

public class Book {
    private int bookId;
    private String bookName;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }
}
