package phrasalScrutiny;

import java.util.ArrayList;

public interface borrowable {
    public abstract void borrowBook(book b[], ArrayList<book> borrowedBooks);
    public abstract void returnBook(book b[],ArrayList<book> borrowedBooks);
    public abstract void viewBorrowedBooks(user u1,ArrayList< book> borrowedBooks);
}
