package practice2Comprehensive;

public class liberalTeacher extends introdction{
    public liberalTeacher(String name, int age){
        super(name, age);
    }

    @Override
    public void teaching(){
        super.teaching();
        System.out.println("教通识课知识");
    }
}
