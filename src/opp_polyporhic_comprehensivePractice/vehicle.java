package opp_polyporhic_comprehensivePractice;

public class vehicle {

    private String brand;
    private double speed;

    public vehicle() {
    }
    public vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void move(){
        System.out.println(getBrand()+"正在以每小时"+getSpeed()+"公里的速度移动");
    }



















}
