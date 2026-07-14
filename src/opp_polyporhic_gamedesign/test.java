package opp_polyporhic_gamedesign;

public class test {
    public static void main(String[] args) {

        character cha[]= new character[3];
        cha[0]=new tank("亚瑟",6000,400,300,30,6000,500);
        cha[1]=new support("孙膑",7000,100,300,35,200);
        cha[2]=new Assassin("韩信",5000,500,200,40,500);

        for(int i=0;i<cha.length;i++){
            System.out.println("=====第"+(i+1)+"个角色=====");
            if(cha[i] instanceof tank){
                tank t=(tank)cha[i];
                t.getHP();
                t.speed();
                t.getDEF();
                t.showInfo();
            }
            else if(cha[i] instanceof support){
                support s=(support)cha[i];
                s.speed();
                s.showInfo();
            }
            else if(cha[i] instanceof Assassin){
                Assassin a=(Assassin)cha[i];
                a.attack();
                a.speed();
                a.showInfo();
            }


        }































    }
}
