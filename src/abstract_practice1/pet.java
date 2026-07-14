package abstract_practice1;

public abstract class pet {
    private String name;
    private String color;

    public pet() {
    }
    public pet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public abstract void eat();
    public abstract void behaviour();
    public void drink() {
        System.out.println(getName()+"喝水");
    }












}
