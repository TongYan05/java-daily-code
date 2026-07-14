package opp_polyporhic_comprehensivePractice2;

public class bird extends  animal {
    public bird() {
    }
    public bird(String name, int age) {
        super(name, age);
    }


    @Override
    public void speak() {
        System.out.println("叽叽喳喳");
    }
    @Override
    public void eat() {
        System.out.println("小鸟在吃虫子");
    }
    public void fly(){
        System.out.println("小鸟在飞翔");
    }





}
