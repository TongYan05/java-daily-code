package opp_polyporhic_comprehensivePractice2;

public class dog extends  animal{
    public dog() {
    }
    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("汪汪汪");
    }
    @Override
    public void eat() {
        System.out.println("小狗在吃骨头");
    }
    public void guardHouse(){
        System.out.println("小狗在看家");
    }





}
