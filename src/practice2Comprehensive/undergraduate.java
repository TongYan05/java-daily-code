package practice2Comprehensive;

import javax.naming.Name;

public class undergraduate extends introdction {
    private String grade;

    public undergraduate(String name, int age, String grade){
        super(name, age);
        this.grade=grade;
    }

    public void setGrade(String grade){this.grade=grade;}
    public String getGrade(){return grade;}

    @Override
    public void studying(){
        super.studying();
        System.out.println("（攻读学士学位）");
    }


}
