package opp_polyporhic_gamedesign;

public class character {
    private String Name;
    private double HP;
    private double ATK;
    private double DEF;
    private double Speed;

    public character() {
    }
    public character(String name, double hp, double atk, double def, double speed) {
        Name = name;
        HP = hp;
        ATK = atk;
        DEF = def;
        Speed = speed;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getATK() {
        return ATK;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public double getDEF() {
        return DEF;
    }

    public void setDEF(double DEF) {
        this.DEF = DEF;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public double attack(){
        return ATK;
    }
    public  double hp(){
        return HP;
    }
    public double def(){
        return DEF;
    }
    public double speed(){
        return Speed;
    }




    public void showInfo(){
        System.out.println("角色名称："+Name+"\t生命值："+HP+"\t攻击力："+ATK+"\t防御力："+DEF+"\t速度："+Speed);
    }






}
