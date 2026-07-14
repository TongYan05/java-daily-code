package ANU7710;

import java.util.Objects;

public class Collection3_student {
    private String name;
    private int age;
    private String sex;
    public Collection3_student(){

    }
    public Collection3_student(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String toString(){
        return "姓名："+name+"，年龄："+age+"，性别："+sex+"   ";
    }


    //重写equals()和hashCode()
    //alt+insert,then choose equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Collection3_student that = (Collection3_student) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(sex, that.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}
