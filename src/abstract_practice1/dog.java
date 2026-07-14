package abstract_practice1;

public class dog extends pet {


    public dog() {
    }

    public dog(String name, String color) {
        super(name, color);
    }


    @Override
    public void behaviour() {
        System.out.println(getName() + "看家");
    }
    @Override
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }




}
