package oop_polymorphic;

public class system {

    public void register(person per){//它只是一个占位符，告诉编译器：调用这个方法时，必须给我一个 person 类型（或其子类）的东西。
        System.out.println("name:"+per.getName()+"username:"+per.getUsername()+"password:"+per.getPassword()+"注册成功！");
        per.work();
    }





}
