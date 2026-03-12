package com.lpu.library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Return Book");
            System.out.println("6. Borrow Book");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Choose an option: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    controller.addBook(id, name, author);
                    break;
                case 2:
                    System.out.print("Enter Book Name to Remove: ");
                    String removeName = scanner.nextLine();
                    controller.removeBook(removeName);
                    break;
                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String searchName = scanner.nextLine();
                    controller.searchBook(searchName);
                    break;
                case 4:
                    controller.displayAllBooks();
                    break;
                case 5:
                    System.out.print("Enter Book Name to Return: ");
                    String returnName = scanner.nextLine();
                    controller.returnBook(returnName);
                    break;
                case 6:
                    System.out.print("Enter Book Name to Borrow: ");
                    String borrowName = scanner.nextLine();
                    controller.borrowBook(borrowName);
                    break;
                case 7:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
