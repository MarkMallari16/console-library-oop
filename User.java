
package simplebookingsystem;

import java.util.ArrayList;


public class User {
    private String name;
    private ArrayList<Book> borrowedBooks;
    
    public User(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public ArrayList<Book> getBorrowedBook(){
        return borrowedBooks;
    }
    
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
    
    public void displayBorrowedBooks(){
        if (borrowedBooks.isEmpty()){
            System.out.println(name + " has no borrowed books.");
        }else{
            System.out.println(name + " Borrowed books: ");
            for (Book book : borrowedBooks){
                System.out.println(" - " + book.getTitle());
            }
        }
    }
}
