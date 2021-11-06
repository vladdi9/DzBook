package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dz {

    public static void main(String[] args) {
        String[] authorsBook1 = {"Борис Акунин"};
        Book book1 = new Book("Планета Вода", authorsBook1, "Феникс", 2015, 256, 406, "Конторский.");

        String[] authorBook2 = {"София Андрухович"};
        Book book2 = new Book("Феликс Австрия", authorBook2, "Издательство Старого Льва", 2014, 208, 432, "Типографский.");

        String[] authorBook3 = {"Леонид Зорин"};
        Book book3 = new Book("Скверный глобус", authorBook3, "СЛОВО", 2008, 511, 198, "Типографский.");

        Book[] books = {book1, book2, book3};

        System.out.println("Список книг Софии Андрухович: " + booksByAuthor("София Андрухович", books));
        System.out.println("Книги выпущены издательством Феникс: " + booksByPublisher("Феникс", books));
        System.out.println("Список книг выпущенных после 2009: " + booksAfterYear(2009, books));

    }
    public static List<Book> booksByAuthor(String author, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            for (String authorBook : book.getAuthors()) {
                if (author.equals(authorBook)) {
                    result.add(book);
                }
            }
        }

        return result;
    }

    public static List<Book> booksByPublisher(String publisher, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (publisher.equals(book.getPublisher())) {
                result.add(book);
            }
        }

        return result;
    }

    public static List<Book> booksAfterYear(int year, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (year < book.getYear()) {
                result.add(book);
            }
        }

        return result;
    }
}



