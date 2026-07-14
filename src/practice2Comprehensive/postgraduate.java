package practice2Comprehensive;

public class postgraduate extends undergraduate {

    public postgraduate(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void studying(){
        System.out.println("（攻读硕士学位）");
    }

    @Override
    public void sleeping(){
        super.sleeping();
        System.out.println("过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉");
    }



    }
