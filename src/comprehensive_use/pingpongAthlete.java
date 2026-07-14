package comprehensive_use;

public class pingpongAthlete extends person implements speak, behavior{
    public pingpongAthlete() {
    }
    public pingpongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
   public void speak(){
       System.out.println(getName()+"can speak English.");
   }
   @Override
    public void behavior(){
       System.out.println(getName()+"learns how to play pingpong.");
   }
















}
