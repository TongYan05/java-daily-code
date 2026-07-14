package phrasalScrutiny;

import java.util.Scanner;

public class library {
    private book[] books = new book[100];
    private int bookCount=0;
    private user[] users = new user[50];
    private int userCount=0;


    public library() {
    }

    public library(book[] books, int bookCount, user[] users, int userCount) {
        this.books = books;
        this.bookCount = bookCount;
        this.users = users;
        this.userCount = userCount;
    }


    public book[] getBooks() {
        return books;
    }

    public void setBooks(book[] books) {
        this.books = books;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public user[] getUsers() {
        return users;
    }

    public void setUsers(user[] users) {
        this.users = users;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }


    public void addBook(book b) {
        if(bookCount == 100){
            System.out.println("图书已满！");
            return;
        }
        else {
            System.out.println("添加图书成功！");
            books[bookCount]=b;
            bookCount++;
            System.out.println("图书总数："+bookCount+" "+"还可添加"+(100-bookCount)+"本");
        }
    }

    public void removeBook(book b[]) {
        System.out.println("请输入要删除的图书：");
        Scanner input = new Scanner(System.in);
        String bookId = input.next();
        for (int i = 0; i < b.length; i++) {
            if (b[i].getTitle().equals(bookId)) {
                System.out.println("删除图书成功！");
                for (int j = i; j < b.length - 1; j++) {
                    b[j] = b[j + 1];
                }
                b[b.length - 1]=null;
                return;
            }
        }
    }


    public void registerUser(user u) {
        if (userCount == 50) {
            System.out.println("用户已满！");
            return;
        }
        else {
            System.out.println("注册用户成功！");
            users[userCount] = u;
            userCount++;
        }
    }

    public void searchBook(String bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookId().equals(bookId)) {
                books[i].displayInfo();
                return;
            }
        }
        System.out.println("图书不存在！");
    }

    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].displayInfo();
        }
    }

    public void getBorrowedCount() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isBorrowed()) {
                count++;
            }
        }
        System.out.println("已借出图书数量：" + count);
    }

    public book[] getAvailableBooksByType(String type) {
        book[] availableBooks = new book[bookCount];
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (!books[i].isBorrowed() && books[i] instanceof textBook && ((textBook) books[i]).getSubject().equals(type)) {
                availableBooks[count] = books[i];
                count++;
            } else if (!books[i].isBorrowed() && books[i] instanceof novel && ((novel) books[i]).getGenre().equals(type)) {
                availableBooks[count] = books[i];
                count++;
            } else if (!books[i].isBorrowed() && books[i] instanceof magazine && ((magazine) books[i]).getIssueNumber().equals(type)) {
                availableBooks[count] = books[i];
                count++;
            }
        }
        return availableBooks;
    }


}
