package opp_polyporhic_comprehensivePractice;

public class car extends  vehicle {
   public car() {
    }
    public car(String brand, double velocity) {
        super(brand, velocity);
    }

    public void ringBell() {
        System.out.println(getBrand()+"鸣笛");
    }
}
