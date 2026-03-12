package com.lpu.library;

public class Book {
    private int id;
    private String name;
    private String author;
    private boolean isAvailable;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Author: %s | Status: %s", id, name, author, isAvailable ? "Available" : "Borrowed");
    }
}
