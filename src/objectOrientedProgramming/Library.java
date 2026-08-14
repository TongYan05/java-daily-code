package objectOrientedProgramming;

import javax.swing.text.DefaultStyledDocument;
import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.Objects;


public class Library {
    private String Name;
    private Book Storage[];
    private int BookNumber;
    private final int MaxStorageNumber = 100;

    public Library() {
        Storage = new Book[MaxStorageNumber];
        BookNumber = 0;
    }


    public Library(String name) {
        Name = name;
        Storage = new Book[MaxStorageNumber];
        BookNumber = 0;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public Book[] getStorage() {
        return Storage;
    }

    public int getBookNumber() {
        return BookNumber;
    }

    public boolean addBook(Book book) {
        if (BookNumber > Storage.length) {
            System.out.println("we have no room for adding new books");
            return false;
        } else {
            Storage[BookNumber] = book;
            System.out.println("successfully added the new book!");
            BookNumber++;
            return true;
        }
    }

    public boolean deleteBook(String ISBN) {
        for (int i = 0; i < BookNumber; i++) {
            if (Storage[i].getISBN().equals(ISBN)) {
                for (int j = i; j < BookNumber - 1; j++) {
                    Storage[j] = Storage[j + 1];
                    Storage[j + 1] = null;
                }
                BookNumber--;
                return true;
            }
        }
        System.out.println("there is no this book!");
        return false;
    }

    public boolean returnBook(String ISBN) {
        for (int i = 0; i < BookNumber; i++) {
            if (Storage[i].getISBN() .equals(ISBN) ) {
                if (Storage[i].getIsBorrowed() == true) {
                    Storage[i].setIsBorrowed(false);
                    return true;
                } else {
                    System.out.println("this book has alredy been returned.");
                    return false;
                }
            }
        }
        System.out.println("there is no such book!");
        return false;
    }



    @Override
    public String toString() {
        return "Library{" + "Name='" + Name + ", Storage=" + Arrays.toString(Storage) + ", BookNumber=" + BookNumber + "}";
    }
}
