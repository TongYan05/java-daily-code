package oop_polymorphic;

public class student extends  person {
    public student() {
    }
    public student(String name, String username, String password) {
        super(name, username, password);
    }

    public void work() {
        System.out.println("学生:" + getName() + "正在学习");
    }


}
