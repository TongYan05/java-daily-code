package comprehensive_use;

public class BasketballAthlete extends  person implements  behavior {
    public BasketballAthlete() {
    }
    public BasketballAthlete(String name, int age) {
        super(name, age);
    }



    @Override
    public void behavior() {
        System.out.println(getName()+"learns how to play basketball.");
    }







}
