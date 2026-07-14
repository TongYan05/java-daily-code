package interface1;

public class frog extends  animal implements jiekou{
    public frog() {
    }
    public frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat(){
        System.out.println(getColor()+"的"+getName()+"在吃虫子");
    }
    @Override
    public void swim(){
        System.out.println(getColor()+"的"+getName()+"在蛙泳");
    }

}
