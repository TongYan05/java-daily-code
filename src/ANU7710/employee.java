package ANU7710;

public class employee {
    private String name;
    private int age;
    private double salary;
    public employee(){

    }
    public employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public String toString(){
        return "员工姓名："+name+"员工年龄："+age+"员工薪资："+salary;
    }


}
