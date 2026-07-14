package comprehensive_use;

public class pingpongCoach extends person implements speak, behavior{
    public pingpongCoach() {
    }
    public pingpongCoach(String name, int age) {
        super(name, age);
    }


    @Override
    public void speak() {
        System.out.println(getName()+"can speak English.");
    }
    @Override
    public void behavior() {
        System.out.println(getName()+"can teach pingpong.");
    }
















}
