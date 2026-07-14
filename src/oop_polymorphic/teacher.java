package oop_polymorphic;

public class teacher extends  person{
    public teacher(){}
    public teacher(String name, String username, String password){
        super(name, username, password);
    }

    public void work(){
        System.out.println("老师" + getName() + "正在工作");
    }

}
