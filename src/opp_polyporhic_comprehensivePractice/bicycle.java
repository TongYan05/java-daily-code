package opp_polyporhic_comprehensivePractice;

public class bicycle extends  vehicle{
    public bicycle() {
    }
    public bicycle(String brand, double velocity) {
        super(brand, velocity);
    }

    public void honk(){
        System.out.println(getBrand()+"响铃");
    }


}
