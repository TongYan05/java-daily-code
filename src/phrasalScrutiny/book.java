package phrasalScrutiny;

public abstract class book {
    private String bookId;
    private String title;
    private String author;
    private double price;
    private boolean isBorrowed;
    private static int totalBooks=0;
    public book() {
    }
    public book(String bookId, String title, String author, double price, boolean isBorrowed) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isBorrowed = isBorrowed;
        totalBooks++;
    }


    public String getBookId() {return bookId;}
    public void setBookId(String bookId) {this.bookId = bookId;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public boolean isBorrowed() {return isBorrowed;}
    public void setBorrowed(boolean isBorrowed) {this.isBorrowed = isBorrowed;}

    public static void setTotalBooks(int totalBooks) {book.totalBooks = totalBooks;}
    public static int getTotalBooks() {return totalBooks;}

    public abstract void displayInfo();




}
