package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public static void borrowBook(Member member, Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            System.out.println(member.getName() + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public static void returnBook(Member member, Book book) {
        book.returnBook();
        System.out.println(member.getName() + " returned the book: " + book.getTitle());
    }
}
