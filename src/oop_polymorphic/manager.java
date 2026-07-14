package oop_polymorphic;

public class manager extends  person{
    public manager() {}

    public manager(String name, String username, String password) {
        super(name, username, password);
    }

    public void work() {
        System.out.println("管理员" + getName() + "正在工作");
    }








}
