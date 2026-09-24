package OOM;

import java.util.Objects;

public class Employee {
    private String name;
    private static double salary;
    private final String description;
    public Employee(){
        description="ANU senior lecturer";//final关键词修饰的，最起码也要在构造结束的时候赋值
    }
    public Employee(String name, double salary, String description){
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
        Employee.salary=salary;
    }
    public static double getSalary(){
        return Employee.salary;
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
        Employee employee=(Employee) otherObject;
        //比较内容
        return Objects.equals(this.name,employee.name) && Objects.equals(this.description,employee.description);
    }

}
