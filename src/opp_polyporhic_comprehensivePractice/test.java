package opp_polyporhic_comprehensivePractice;

public class test {
   public static void main(String[] args) {

       person p1=new person("TongYan",18,"Male");
       car c1=new car("Benz",120);
       bicycle b1=new bicycle("Yamaha",50);
       p1.drive(c1);
       p1.drive(b1);
       System.out.println(p1.getName()+" is "+p1.getAge()+" years old and is a "+p1.getSex());
       System.out.println(c1.getBrand()+" is a car and its speed is "+c1.getSpeed());
       System.out.println(b1.getBrand()+" is a bicycle and its speed is "+b1.getSpeed());































   }


}
