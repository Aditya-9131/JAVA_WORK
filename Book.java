import java.util.Scanner;

class Book {
    private int bookId;
    private String bookTitle;
    private int yearOfPublication;
    private String authorName;
    private String publisherName;
    private int numberOfAvailableCopies;
    private int totalCopies;

    public Book() {
    }

    public Book(int totalCopies) {
        this.totalCopies = totalCopies;
        this.numberOfAvailableCopies = totalCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public void setDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        bookId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Book Title: ");
        bookTitle = scanner.nextLine();
        System.out.print("Enter Year of Publication: ");
        yearOfPublication = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Author Name: ");
        authorName = scanner.nextLine()21 + bookTitle);
            System.out.println("Year of Publication: " + yearOfPublication);
            System.out.println("Author: " + authorName);
            System.out.println("Publisher: " + publisherName);
            System.out.println("Total Copies: " + totalCopies);
            System.out.println("Available Copies: " + numberOfAvailableCopies);
        } else {
            System.out.println("Book with ID " + id + " not found.");
        }
    }

    public void issue(int id) {
        if (bookId == id && numberOfAvailableCopies > 0) {
            numberOfAvailableCopies--;
            System.out.println("Book issued successfully.");
        } else if (bookId == id && numberOfAvailableCopies == 0) {
            System.out.println("All copies of the book are already issued.");
        } else {
            System.out.println("Book with ID " + id + " not found.");
        }
    }

    public void returnBook(int id) {
        if (bookId == id && numberOfAvailableCopies < totalCopies) {
            numberOfAvailableCopies++;
            System.out.println("Book returned successfully.");
        } else if (bookId == id && numberOfAvailableCopies == totalCopies) {
            System.out.println("All copies of the book are already available.");
        } else {
            System.out.println("Book with ID " + id + " not found.");
        }
    }
}

public class Asg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book " + (i + 1));
            books[i] = new Book();
            books[i].setDetails();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Set Details");
            System.out.println("2. Get Details");
            System.out.println("3. Issue");
            System.out.println("4. Return");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after reading choice

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the book ID: ");
                int bookId = scanner.nextInt();
                scanner.nextLine(); // Consume newline after reading bookId
                boolean found = false;
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        found = true;
                        switch (choice) {
                            case 1:
                                book.setDetails();
                                break;
                            case 2:
                                book.getDetails(bookId);
                                break;
                            case 3:
                                book.issue(bookId);
                                break;
                            case 4:
                                book.returnBook(bookId);
                                break;
                        }
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book with ID " + bookId + " not found.");
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }
}
