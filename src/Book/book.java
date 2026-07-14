package Book;

public class book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isBorrowed;
    static int totalBooks;

    public book() {System.out.println("A new book is created");}

    public book(String title, String author, String isbn, double price, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.isBorrowed = isBorrowed;
        totalBooks++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public boolean getIsBorrowed() {
        return this.isBorrowed;
    }

    public void showInfo() {
        System.out.println("Title:" + this.title + " Author:" + this.author + " Isbn:" + this.isbn + " Price:" + this.price + " IsBorrowed:" + this.isBorrowed+" TotalBooks:"+totalBooks);
    }

    public void borrowBook() {
        if (this.isBorrowed == true){System.out.println("This book is already borrowed.");}
        else {
            System.out.println("You have successfully borrowed this book.");
            this.isBorrowed = true;
        }

    }

    public void returnBook() {
        if(this.isBorrowed == true){
            System.out.println("You have successfully returned this book.");
            this.isBorrowed = false;
        }
        else System.out.println("This book is not borrowed.");

    }

    public static int getTotalBooks() {
        return totalBooks;
    }


}



