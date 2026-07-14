package abstract_practice1;

public class cat extends pet {


    public cat() {
    }

    public cat(String name, String color) {
        super(name, color);
    }


    @Override
    public void behaviour() {
        System.out.println(getName() + "抓老鼠");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "在吃鱼");
    }


}
