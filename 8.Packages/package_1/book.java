package library.books;

public class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + available);
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
        }
    }

    public void returnBook() {
        available = true;
    }

    public String getTitle() {
        return title;
    }
}
