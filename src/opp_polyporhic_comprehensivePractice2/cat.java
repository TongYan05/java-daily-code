package opp_polyporhic_comprehensivePractice2;

public class cat extends  animal{
    public cat() {
    }
    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("喵喵喵");
    }
    @Override
    public void eat() {
        System.out.println("小猫在吃鱼");
    }
    public void catchMouse(){
        System.out.println("小猫在抓老鼠");
    }





}
