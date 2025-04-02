import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryMain {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book(101, "Harry Potter", "J.K. Rowling");
        Book book2 = new Book(102, "The Hobbit", "J.R.R. Tolkien");


        Member member1 = new Member(1, "Chetan Kumar", "chetan@example.com");


        book1.displayBookDetails();
        book2.displayBookDetails();
        member1.displayMemberDetails();

        Transaction.borrowBook(member1, book1);
        Transaction.borrowBook(member1, book1); // Should show "not available"
        Transaction.returnBook(member1, book1);
        Transaction.borrowBook(member1, book1); // Now it should work
    }
}
