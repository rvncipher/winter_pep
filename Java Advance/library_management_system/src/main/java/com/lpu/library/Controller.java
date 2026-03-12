package com.lpu.library;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {
    private ArrayList<Book> books;

    public Controller() {
        books = new ArrayList<>();
    }

    public void addBook(int id, String name, String author) {
        books.add(new Book(id, name, author));
        System.out.println("Book added successfully.");
    }

    public void removeBook(String name) {
        Iterator<Book> it = books.iterator();
        boolean found = false;
        while (it.hasNext()) {
            Book b = it.next();
            if (b.getName().equalsIgnoreCase(name)) {
                it.remove();
                found = true;
                System.out.println("Book removed successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public void searchBook(String name) {
        for (Book b : books) {
            if (b.getName().equalsIgnoreCase(name)) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void borrowBook(String name) {
        for (Book b : books) {
            if (b.getName().equalsIgnoreCase(name)) {
                if (b.isAvailable()) {
                    b.setAvailable(false);
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String name) {
        for (Book b : books) {
            if (b.getName().equalsIgnoreCase(name)) {
                if (!b.isAvailable()) {
                    b.setAvailable(true);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
