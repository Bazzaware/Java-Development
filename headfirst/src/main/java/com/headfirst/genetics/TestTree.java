package com.headfirst.genetics;

import java.util.Set;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    private void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        /*
         * TreeSet elements must be Comparable. The Book class implements Comparable.
         * Otherwise, we would get a ClassCastException.
         * Another option would be to pass a Comparator to the TreeSet constructor.
         * TreeSet<Book> tree = new TreeSet<>(new Comparator<Book>() {
         * 
         * @Override
         * public int compare(Book o1, Book o2) {
         * return o1.getTitle().compareTo(o2.getTitle());
         * }
         * });
         * Or, using a lambda expression:
         * TreeSet<Book> tree = new TreeSet<>((o1, o2) ->
         * o1.getTitle().compareTo(o2.getTitle()));
         * Or, using a method reference:
         * TreeSet<Book> tree = new TreeSet<>(Comparator.comparing(Book::getTitle));
         */
        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}
