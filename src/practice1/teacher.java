package practice1;

public class teacher extends trait{
    private String subject;
    public teacher(String name, int age, String subject){
        super(name, age);
        this.subject=subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }
}
