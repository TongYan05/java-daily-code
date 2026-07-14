package interface1;

public class dog extends  animal implements jiekou{
    public dog() {
    }
    public dog(String name, String color) {
        super(name, color);
    }


    @Override
    public void eat() {
        System.out.println(getColor()+"的"+getName()+"在吃骨头");
    }
    @Override
    public void swim(){
        System.out.println(getColor()+"的"+getName()+"在游泳");
    }






}
