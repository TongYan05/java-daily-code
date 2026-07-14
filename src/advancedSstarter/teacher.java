package advancedSstarter;

public class teacher extends person{
    private String subject;
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void teaching(){
        System.out.println("老师正在教学"+subject);
    }
}
