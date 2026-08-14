package objectOrientedProgramming;

import com.sun.jdi.Value;

//题目：图书管理系统
//        设计一个简单的图书管理系统，包含以下要求：
//        Book 类
//        属性：书名（title）、作者（author）、ISBN、价格（price）、是否借出（isBorrowed）
//        构造方法
//        getter 和 setter 方法
//        toString 方法显示图书信息
//        Library 类
//        属性：图书馆名称、图书数组（最多存储 100 本图书）、当前图书数量
//        方法：
//        添加图书
//        删除图书（根据 ISBN）
//        查找图书（根据书名或作者，支持模糊查询）
//        借书（根据 ISBN，如果已被借出则提示）
//        还书（根据 ISBN）
//        显示所有图书
//                显示所有已借出的图书
//        测试类
//                创建图书馆对象
//        添加至少 5 本图书
//        测试查找、借书、还书、删除等功能
public class Book {
    private String Name;
    private String Author;
    private String ISBN;
    private double Price;
    private boolean IsBorrowed;


    public Book() {
    }
    public Book(String Name, String Author, String ISBN, Double Price, Boolean IsBorrowed) {
        this.Name = Name;
        this.Author = Author;
        this.ISBN = ISBN;
        this.Price = Price;
        this.IsBorrowed = IsBorrowed;
    }

   public void setName(String name){
        Name=name;
   }
   public String getName(){
        return Name;
   }

    public void setAuthor(String author){
        Author=author;
    }
    public String getAuthor(){
        return Author;
    }

    public void setPrice(Double price){
        Price=price;
    }
    public Double getPrice(){
        return Price;
    }

    public void setISBN(String isbn){
        ISBN=isbn;
    }
    public String getISBN(){
        return ISBN;
    }

    public void setIsBorrowed(boolean isBorrowed){
        IsBorrowed=isBorrowed;
    }
    public boolean getIsBorrowed(){
        return IsBorrowed;
    }


    @Override
    public String toString(){
        return "NAME:"+getName()+", "+"AUTHOR:"+getAuthor()+", "+"ISBN:"+getISBN()+", "+"PRICE:"+getPrice()+", "+"ISBORROWED:"+getIsBorrowed()+"]\n";
    }
}
