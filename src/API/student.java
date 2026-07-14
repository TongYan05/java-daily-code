package API;

import java.util.ArrayList;
import java.util.Scanner;

public class student {
    private String name;
    private int age;
    private String id;
    public student(){
    }
    public student(String name,int age,String id){
        this.name = name;
        this.age = age;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public int index(String id,  ArrayList< student> arr){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }







}
