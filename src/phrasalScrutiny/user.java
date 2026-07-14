package phrasalScrutiny;

import java.util.ArrayList;

public abstract class user implements borrowable {
    private String userId;
    private String name;
    private ArrayList<book> borrowedBooks;
    private int borrowedCount=0;


    public user() {
    }
    public user(String userId, String name, int borrowedCount) {
        this.userId = userId;
        this.name = name;
        this.borrowedCount=borrowedCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public void setBorrowedCount(int borrowedCount) {
        this.borrowedCount = borrowedCount;
    }

    @Override
    public  void borrowBook(book b1[],ArrayList<book> borrowedBooks) {

    }
    @Override
    public void returnBook(book b2[],ArrayList<book> borrowedBooks) {

    }

    @Override
    public void viewBorrowedBooks(user u1,ArrayList< book> borrowedBooks) {
        System.out.println("用户：" + u1.getName() + "的借阅书籍列表：");
        for (int i = 0; i < borrowedBooks.size(); i++){
            borrowedBooks.get(i).displayInfo();
        }
    }








}
