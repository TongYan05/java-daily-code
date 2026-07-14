package opp_polyporhic_comprehensivePractice2;

import javax.crypto.interfaces.PBEKey;

public class animal {
    private String name;
    private int age;

    public animal() {
    }
    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void speak(){
        System.out.println("动物发出声音");
    }
    public void eat(){
        System.out.println("动物吃东西");
    }
    public void getDescription(){
        System.out.println("动物的名字是"+getName()+"，年龄是"+getAge());
    }






















}
