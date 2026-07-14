package com.anu.basic;

public class worker {
    private String name;
    private int age;
    private int working_years;
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }

    public void setage(int a){
        if(a<0||a>100)System.out.println("Invalid age");
        else age=a;
    }
    public int getage(){
        return age;
    }

    public void setworking_years(int y){
        if(y<0||y>50) System.out.println("Invalid working years");
        else working_years=y;
    }
    public int getworking_years(){
        return working_years;
    }


    public void behavior(){
        System.out.println(age+" years' "+name+" has worked for "+working_years+" years.");
    }
}
