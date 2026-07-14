package advancedSstarter;

public class student extends person {
    private String grade ;
    public void setGrade(String grade){this.grade = grade;}
    public String getGrade(){return grade;}
    public void studying(){
        System.out.println("正在学习");
    }
}
