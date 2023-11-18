package com.headfirst.genetics;

public class Book implements Comparable<Book> {
    private String _title;

    public Book(String string) {
        _title = string;
    }

    @Override
    public int compareTo(Book o) {
        return _title.compareTo(o._title);
    }

}
