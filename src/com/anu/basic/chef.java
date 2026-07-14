package com.anu.basic;

public class chef {
    private String name;
    public void setName(String value){
        name=value;
    }
    public String getName(){
        return name;
    }
    private int age;
    public void setAge(int value){
        if(value>100){
            System.out.println("Invalid age");
        }
        else age=value;
    }
    public int getAge(){
        return age;
    }
    public void movement(){
        System.out.println("Chef is cooking");
    }
}
