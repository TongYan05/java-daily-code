package interface1;

public class rabbit extends animal{
    public rabbit() {
    }
    public rabbit(String name, String color) {
        super(name, color);
    }


@Override
    public void eat() {
        System.out.println(getColor()+"的"+getName()+"吃胡萝卜");
    }

}
