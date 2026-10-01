package MidTerm27710;

import OOM.Employee;

import java.util.Objects;

public class employee implements test{

    private String name;
    private static double salary;
    private final String description;
    public employee(){
        description="ANU senior lecturer";//final关键词修饰的，最起码也要在构造结束的时候赋值
    }
    public employee(String name, double salary, String description){
        this.name=name;
        this.salary=salary;
        this.description=description;
    }

    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }
    //这个getter setter其实是多余的，因为static变量用 类名.变量名进行调用，进行增删改查
    //如果这样想我就错了，因为salary是private所以需要方法来调用
    public static void setSalary(double salary){
        employee.salary=salary;
    }
    public static double getSalary(){
        return employee.salary;
    }
    public String getDescription(){
        return this.description;
    }


    public void info(){
        System.out.println("this is employee!");
    }

    @Override
    public boolean equals(Object otherObject){
        //比较内存地址
        if(otherObject==this) return true;
        //判断是不是null
        if(otherObject==null) return false;
        //比较class
        if(this.getClass()!=otherObject.getClass()) return false;
        //cast转换类型
        employee e=(employee) otherObject;
        //比较内容
        return Objects.equals(this.name,e.name) && Objects.equals(this.description,e.description);
    }


    @Override
    public void cat1(){
        System.out.println("cat1");
    }
    @Override
    public void dog6() {
        System.out.println("d0g666");
    }

    @Override
    public int num(int x) {
        return -1;
    }

    @Override
    public void dog1(){
        System.out.println("dog1");
    }





}
