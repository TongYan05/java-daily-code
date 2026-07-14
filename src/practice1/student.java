package practice1;

public class student extends trait {
    private String grade;
    public student(String name, int age, String grade){
        super(name, age);
        this.grade=grade;
    }
    public void setGrade(String grade){this.grade=grade;}
    public String getGrade(){return grade;}
}
