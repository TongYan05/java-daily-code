package comprehensive_use;

public class BasketballCoach extends person implements  behavior{
    public BasketballCoach() {
    }
    public BasketballCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void behavior() {
        System.out.println(getName()+"can teach how to play basketball.");
    }

}
