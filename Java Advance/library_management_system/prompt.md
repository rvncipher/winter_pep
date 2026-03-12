# Library Management Project Prompt

## Project Overview
This project is a simple Library Management System implemented in Java. It allows users to manage a collection of books with basic operations such as adding, removing, searching, displaying, borrowing, and returning books. The application is console-based and uses a menu-driven approach for user interaction.

## Main Features
- **Add Book**: Add a new book with ID, name, and author.
- **Remove Book**: Remove a book by its name.
- **Search Book**: Search for a book by its name and display its status (Available/Borrowed).
- **Display All Books**: List all books with their details and availability status.
- **Borrow Book**: Mark a book as borrowed if available.
- **Return Book**: Mark a borrowed book as returned.
- **Exit**: Exit the application.

## Core Classes and Workflow
- **Book**: Represents a book with fields for ID, name, author, and availability status.
- **Controller**: Manages the list of books and provides methods for all operations (add, remove, search, display, borrow, return).
- **main**: Contains the main method, displays the menu, takes user input, and calls the appropriate methods in `Controller`.

## Typical Workflow
1. The application starts and displays a menu with options.
2. The user selects an option (e.g., Add Book).
3. The application prompts for required details (e.g., ID, name, author for adding a book).
4. The selected operation is performed, and feedback is shown.
5. The menu is displayed again until the user chooses to exit.

## Example Menu
```
Menu:
1. Add Book
2. Remove Book
3. Search Book
4. Display All Books
5. Return Book
6. Borrow Book
7. Exit
Choose an option:
```

## Implementation Notes
- The book list is stored in memory using an `ArrayList<Book>`.
- All operations are performed via the `Controller` class.
- The application is structured for clarity and simplicity, suitable for learning Java basics and OOP.

---

**Goal:**
Re-implement this exact workflow and features from scratch, but in your own files and structure. Use this prompt as a reference for the required functionality and user experience.
