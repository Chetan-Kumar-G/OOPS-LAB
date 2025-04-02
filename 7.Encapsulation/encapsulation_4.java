class Book {
    private String title;
    private String author;
    private int copies;

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public void borrowBook() {
        if (copies > 0) {
            copies--;
            System.out.println("You borrowed \"" + title + "\" by " + author + ". Copies left: " + copies);
        } else {
            System.out.println("Sorry, \"" + title + "\" is out of stock.");
        }
    }

    public void returnBook() {
        copies++;
        System.out.println("You returned \"" + title + "\". Copies available now: " + copies);
    }

    public void getDetails() {
        System.out.println("Book: " + title + " | Author: " + author + " | Copies available: " + copies);
    }
}




public class encapsulation_4 {
    public static void main(String[] args) {
        Book myBook = new Book("The Alchemist", "Paulo Coelho", 3);

        myBook.getDetails();
        myBook.borrowBook();
        myBook.borrowBook();
        myBook.borrowBook();
        myBook.borrowBook(); 
        myBook.returnBook();
        myBook.getDetails();
    }
}
