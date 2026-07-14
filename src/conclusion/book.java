package conclusion;

public abstract class book {
    private String name;
    private String ISBN;
    private String author;
    private double price;
    private boolean isBorrowed;
    public static int booknumber = 0;

    public book() {
    }


    public book(String name, String ISBN, String author, double price, boolean isBorrowed) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
        this.isBorrowed = isBorrowed;
        booknumber++;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }


    public abstract void showInfo();

    public void show() {
        System.out.println("价格：" + getPrice());
    }


}
