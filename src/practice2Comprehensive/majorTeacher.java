package practice2Comprehensive;

import javax.security.auth.Subject;

public class majorTeacher extends introdction {
    private String Subject;

    public majorTeacher(String name, int age, String Subject){
        super(name, age);
        this.Subject=Subject;
    }

    public void setSubject(String Subject){this.Subject=Subject;}
    public String getSubject(){return Subject;}

    @Override
    public void teaching(){
        super.teaching();
        System.out.println("教专业课知识");
    }

}
