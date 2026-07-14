package com.anu.basic;

public class student1 {
    private String name;
    public void setName(String value) {name = value;}
    public String getName(){return name;}
    private int age;
    public void setAge(int value){age=value;}
    public int getAge(){return age;}
    private float weight;
    public void setWeight(int value){
        if(value==18)weight=60;
        else if(value==19)weight=60+10;
        else if(value==20)weight=60+7;
        else if(value==21)weight=60+7;
    }
    public double getWeight(){return weight;}
    private double height;
    public void setHeight(int value){
        if(value==18)height=1.83;
        else if(value==19)height=1.83;
        else if(value==20)height=1.83+0.2;
        else if(value==21)height=1.83+0.2;
    }
    public double getHeight(){return height;}
    public void behavior(int value){
        if(value==18)System.out.println(name+"刚进大学努力学习");
        else System.out.println(name+"在学习");
    }



}
