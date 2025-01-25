package simplebookingsystem;

import java.util.Scanner;

public class SimpleBookingSystem {

    public static void displayOption() {
        System.out.println("============== Library Management System ============== ");
        System.out.println("[1] Display Available Book");
        System.out.println("[2] Borrow Book");
        System.out.println("[3] Return Book");
        System.out.println("[4] Show Borrowed Books");
        System.out.println("[5] EXIT");
        System.out.println("=======================================================");
        System.out.print("Option: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        Library library = new Library();
        library.addBook(new Book("Book ko to", "Mark Mallari"));
        library.addBook(new Book("Si pagong at matsing", "Jose Rizal"));
        library.addBook(new Book("To Kill a Mockingbir", "Harper Lee"));
        User user = new User("John Cruz");

        while (true) {
            displayOption();
            choice = input.nextInt();

            input.nextLine();
            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter title of book: ");
                    String title = input.nextLine();

                    library.borrowBook(title, user);
                    break;
                case 3:
                    System.out.print("Enter title to return book: ");
                    String returnTitle = input.nextLine();

                    library.returnBook(returnTitle, user);
                    break;
                case 4:
                    user.displayBorrowedBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);
                    break;
            }
        }
    }

}
