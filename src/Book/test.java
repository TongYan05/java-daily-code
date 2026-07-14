package Book;

public class test {
    public static void main(String[] args) {



        book situation1=new book();
        book situation2=new book("简爱","Marli","TNDC06",56.8,false);
        situation2.showInfo();
        situation2.borrowBook();
        situation2.showInfo();
        situation2.returnBook();
        situation2.showInfo();

        book situation3=new book("挪威的森林","Jebria","Ttsd406",76.9,false);
        situation3.showInfo();


        int number=book.getTotalBooks();
        System.out.println("Total books: "+number);



    }
}


//1. Book 类（书籍类）
//属性：
//title（书名，String）
//author（作者，String）
//isbn（ISBN号，String）
//price（价格，double）
//isBorrowed（是否被借出，boolean）
//static int totalBooks（静态变量，记录总书籍数量）
//方法：
//无参构造方法（打印 "A new book is created"）
//有参构造方法（初始化所有非静态属性，每创建一个对象，totalBooks 加 1）
//getter 和 setter 方法（注意：isBorrowed 的 setter 需要验证逻辑）
//showInfo() 方法：显示书籍信息
//borrowBook() 方法：借书（如果未被借出，则设置 isBorrowed 为 true，并打印 "借书成功"；否则打印 "该书已被借出"）
//returnBook() 方法：还书（如果已借出，则设置 isBorrowed 为 false，并打印 "还书成功"；否则打印 "该书未被借出"）
//static int getTotalBooks()：返回总书籍数量