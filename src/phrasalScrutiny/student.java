package phrasalScrutiny;

import java.util.ArrayList;
import java.util.Scanner;

public class student extends user {
    private String studentId;
    private String major;
    private static int maxBorrowLimit = 5;

    public student() {
    }

    public student(String studentId, String major, String userId, String name, int borrowedCount) {
        super(userId, name, borrowedCount);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void borrowBook(book b1[], ArrayList<book> borrowedBooks) {
        if (getBorrowedCount() == maxBorrowLimit) {
            System.out.println("You have reached your borrowing limit.");
            return;
        } else if (getBorrowedCount() < maxBorrowLimit) {
            System.out.println("You can borrow " + (maxBorrowLimit - getBorrowedCount()) + " books.");
        }
        System.out.println("Start borrowing books!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the book name: ");
        String bookName = input.nextLine();
        for (int i = 0; i < b1.length; i++) {
            if (b1[i].getTitle().equals(bookName)) {
                if (b1[i].isBorrowed()) {
                    System.out.println("This book is already borrowed.");
                } else {
                    System.out.println("Book borrowed successfully.");
                    b1[i].setBorrowed(true);
                    setBorrowedCount(getBorrowedCount() + 1);
                    borrowedBooks.add(b1[i]);
                }
            }
        }
    }


    @Override
    public void returnBook(book b2[],ArrayList<book> borrowedBooks) {
        if (getBorrowedCount() == 0) {
            System.out.println("You haven't borrowed any books.");
            return;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the book name that you wish to return: ");
        String bookName = input.nextLine();

        for(int i = 0; i < b2.length; i++){
            if(b2[i].getTitle().equals(bookName)){
                if(b2[i].isBorrowed()){
                    System.out.println("Book returned successfully");
                    b2[i].setBorrowed(false);
                    setBorrowedCount(getBorrowedCount() - 1);
                    borrowedBooks.remove(b2[i]);
                }
                else{
                    System.out.println("Book has already returned!");
                }
            }
        }
    }

}
