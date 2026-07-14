package conclusion;

import java.util.ArrayList;

public class teacher extends member implements Borrowable, Discountable {
    public teacher() {
        super();
    }

    public teacher(String name, int age, int VIPnumber, double balance, int borrowednumber) {
        super(name, age, VIPnumber, balance, borrowednumber);
    }

    @Override
    public void showInfo() {
        System.out.println("=====老师信息=====");
        System.out.println("姓名：" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("会员编号：" + getVIPnumber());
        System.out.println("余额：" + getBalance());
    }

    @Override
    public void borrowBook(ArrayList<book> arr, String title) {
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getName().equals(title)){
                if(arr.get(i).isBorrowed()==false){
                    setBorrowednumber(getBorrowednumber()+1);
                    if(getBorrowednumber()<=10){
                        System.out.println("借阅成功！");
                        arr.get(i).setBorrowed(true);
                    }
                    else {
                        System.out.println("学生最多只能借五本书！");
                    }
                }
                else {
                    System.out.println("该书已被借出！");
                }
            }
            else if(i==arr.size()-1&&!arr.get(i).getName().equals(title)){
                System.out.println("没有此书！");
            }
        }
    }

    @Override
    public void returnBook(ArrayList<book> arr, String title) {
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getName().equals(title)){
                if(arr.get(i).isBorrowed()==true){
                    setBorrowednumber(getBorrowednumber()-1);
                    if(getBorrowednumber()>=0){
                        System.out.println("还书成功！");
                        arr.get(i).setBorrowed(false);
                    }
                    else {
                        System.out.println("这是你的书，图书管里早已有该书存储！");
                    }
                }
                else {
                    System.out.println("该书早已被归还！");
                }
            }
            else if(i==arr.size()-1&&!arr.get(i).getName().equals(title)){
                System.out.println("没有此书！");
            }
        }
    }
    @Override
    public double discount (double input){
        return input*0.9;
    }


}
