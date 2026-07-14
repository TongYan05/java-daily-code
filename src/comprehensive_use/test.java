package comprehensive_use;

public class test {
    public static void main(String[] args) {

        pingpongCoach pc=new pingpongCoach("马龙",40);
        pc.speak();
        pc.behavior();
        System.out.println("======================================");
        pingpongAthlete pa=new pingpongAthlete("王五",20);
        pa.speak();
        pa.behavior();
        System.out.println("======================================");
        BasketballCoach bc=new BasketballCoach("张三",30);
        bc.behavior();
        System.out.println("======================================");
        BasketballAthlete ba=new BasketballAthlete("李四",10);
        ba.behavior();


        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("======================================");


        person per[]=new person[4];
        per[0]=new pingpongAthlete("王五",20);
        per[1]=new pingpongCoach("马龙",40);
        per[2]=new BasketballCoach("张三",30);
        per[3]=new BasketballAthlete("李四",10);
        for (int i = 0; i < per.length; i++) {
            System.out.println("==============第"+(i+1)+"位人物=============");
            if(per[i] instanceof pingpongAthlete){
                pingpongAthlete pa1=(pingpongAthlete)per[i];
                pa1.speak();
                pa1.behavior();
            }else if(per[i] instanceof pingpongCoach){
                pingpongCoach pc1=(pingpongCoach)per[i];
                pc1.speak();
                pc1.behavior();
            }else if(per[i] instanceof BasketballCoach){
                BasketballCoach bc1=(BasketballCoach)per[i];
                bc1.behavior();
            }else if(per[i] instanceof BasketballAthlete){
                BasketballAthlete ba1=(BasketballAthlete)per[i];
                ba1.behavior();
            }
        }









    }
}
