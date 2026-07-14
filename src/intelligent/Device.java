package intelligent;

public abstract class Device {
    private String name;
    private String brand;

    public Device() {
    }

    public Device(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void showInfo() {
        System.out.println("设备名称：" + name + "\t设备品牌：" + brand);
    }





}
