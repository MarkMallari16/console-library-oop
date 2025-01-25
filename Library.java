package simplebookingsystem;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books in the Library: ");
        for (Book book : books) {
            if (!book.isBorrowed) {
                System.out.println(" - " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public boolean borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isBorrowed) {
                book.setIsBorrowed(true);
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed \"" + title + "\".");
                return true;
            }
        }
        System.out.println("Sorry, \"" + title + "\" is not available.");
        return false;
    }

    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setIsBorrowed(false);
                user.returnBook(book);
                System.out.println(user.getName() + " returned \"" + title + "\".");
                return;
            }
        }
        System.out.println("Book not found in " + user.getName() + "'s borrowed list.");

    }
}
